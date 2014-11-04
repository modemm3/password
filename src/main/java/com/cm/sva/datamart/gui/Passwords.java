/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Passwords.java
 *
 * Created on Oct 30, 2014, 10:23:02 PM
 */
package com.cm.sva.datamart.gui;

import java.awt.Color;
import java.awt.Label;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.edisoncor.gui.label.LabelTask;

import com.cm.sva.datamart.dao.ConfigDAO;
import com.cm.sva.datamart.dao.ItemsDAO;
import com.cm.sva.datamart.dao.RecordDAO;
import com.cm.sva.datamart.dto.ConfigDTO;
import com.cm.sva.datamart.dto.ItemsDTO;
import com.cm.sva.datamart.dto.RecordDTO;

/**
 *
 * @author Modesto Mejia Martinez
 */
public class Passwords extends javax.swing.JFrame {


	private int top=0;
    public Passwords() {
        initComponents();
        try{
        createConfig();
//        createLabel2();
//        createLabel3();
        }
        catch(Exception ex){
        	ex.printStackTrace();
        }
    }

    public final void createConfig() throws Exception{
    	final ConfigDAO configDAO= new ConfigDAO();
    	List<ConfigDTO> listConfigDTO= configDAO.getListConfig(2);
        for(final ConfigDTO configDTO:listConfigDTO){
        	LabelTask config= new LabelTask(configDTO.getName());
        	config.addMouseListener(new Event() {
				
				@Override
				public void execute() {
					RecordDAO recordDAO= new RecordDAO();
					try{
						List<RecordDTO> listRecordDTO=recordDAO.getListRecord(1, configDTO.getId());
						for(final RecordDTO recordDTO:listRecordDTO){
							LabelTask record= new LabelTask(recordDTO.getName());
							record.addMouseListener(new Event() {
								@Override
								public void execute() {
									ItemsDAO itemsDAO= new ItemsDAO();
									try{
										List <ItemsDTO> listItemsDTO=itemsDAO.getListRecord(recordDTO.getId());
										for(final ItemsDTO itemsDTO:listItemsDTO){
											ConfigDTO configDTO= new ConfigDTO();
											configDTO=configDAO.getConfigById(itemsDTO.getConfigId());
											JLabel items= new JLabel(configDTO.getName());
											items.setBounds(10, top+10, 200, 25);
											panelNice5.add(items);
											if(configDTO.getSecret().booleanValue()){
												JPasswordField itemsValue= new JPasswordField(itemsDTO.getValue());
												itemsValue.setBounds(210, top+10, 200, 25);
												panelNice5.add(itemsValue);
											}
											else{
												JTextField itemsValue= new JTextField(itemsDTO.getValue());
												itemsValue.setBounds(210, top+10, 200, 25);
												panelNice5.add(itemsValue);
											}
											top+=60;
										}
									}
									catch(Exception ex){
										ex.printStackTrace();
									}
								}
							});
							panelNice2.add(record);
						}
						
					}
					catch(Exception ex){
						ex.printStackTrace();
					}
				}
			});
            panelNice1.add(config);
            panelNice1.setBackground(new Color(128, 128, 128));
            panelNice2.setBackground(new Color(128, 128, 128));
            panelNice3.setBackground(new Color(128, 128, 128));
            panelNice4.setBackground(new Color(128, 128, 128));
            panelNice5.setBackground(new Color(128, 128, 128));
        }
    }
    public final void createLabel2(){
        for(int i=0;i<5;i++){
        	LabelTask l= new LabelTask();
            panelNice2.add(new LabelTask("LABEL "+i));
        }
    }
    public final void createLabel3(){
        for(int i=0;i<5;i++){
            Label l= new Label("LABEL "+i);
        
//            l.setSize(100,25);
//            l.setBounds(10, 10, 10, 10);
             
//            panelNice5.add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        panelNice3 = new org.edisoncor.gui.panel.PanelNice();
        panelNice4 = new org.edisoncor.gui.panel.PanelNice();
        panelNice5 = new org.edisoncor.gui.panel.PanelNice();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelNice1.setLayout(new java.awt.FlowLayout());

        panelNice2.setLayout(new java.awt.FlowLayout());

        panelNice3.setBackground(java.awt.SystemColor.control);

        panelNice5.setLayout(null);

        javax.swing.GroupLayout panelNice3Layout = new javax.swing.GroupLayout(panelNice3);
        panelNice3.setLayout(panelNice3Layout);
        panelNice3Layout.setHorizontalGroup(
            panelNice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelNice4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNice5, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelNice3Layout.setVerticalGroup(
            panelNice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNice4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNice5, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNice1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelNice2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNice3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelNice3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNice2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Passwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Passwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Passwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Passwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Passwords().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private org.edisoncor.gui.panel.PanelNice panelNice3;
    private org.edisoncor.gui.panel.PanelNice panelNice4;
    private org.edisoncor.gui.panel.PanelNice panelNice5;
    // End of variables declaration//GEN-END:variables
}
