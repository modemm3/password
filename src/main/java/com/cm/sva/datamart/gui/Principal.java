/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.sva.datamart.gui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.cm.sva.datamart.dao.ConfigDAO;
import com.cm.sva.datamart.dao.ItemsDAO;
import com.cm.sva.datamart.dao.RecordDAO;
import com.cm.sva.datamart.dao.UserDAO;
import com.cm.sva.datamart.dto.ConfigDTO;
import com.cm.sva.datamart.dto.ItemsDTO;
import com.cm.sva.datamart.dto.RecordDTO;
import com.cm.sva.datamart.dto.UserDTO;
import com.cm.sva.datamart.gui.components.Button;
import com.cm.sva.datamart.gui.components.HideText;
import com.cm.sva.datamart.gui.components.Label;
import com.cm.sva.datamart.gui.components.LabelRecord;
import com.cm.sva.datamart.gui.components.Text;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 *
 * @author Developer
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Principal p=this;
    private int top=0;
    private Label title;
    public Principal() {
        initComponents();
        config();
        panelNice1.setBackground(new Color(120, 120, 120));
        panelNice2.setBackground(new Color(120, 120, 120));
        panelNice3.setBackground(new Color(120, 120, 120));
        panelNice4.setBackground(new Color(120, 120, 120));
        panelNice5.setBackground(new Color(120, 120, 120));        
        panelNice1.repaint();
        ConfigDTO con= new ConfigDTO();
        con.setName("    ");
        title=new Label(con);
        panelNice4.add(title);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNice3 = new org.edisoncor.gui.panel.PanelNice();
        panelNice4 = new org.edisoncor.gui.panel.PanelNice();
        panelNice5 = new org.edisoncor.gui.panel.PanelNice();
        panelNice6 = new org.edisoncor.gui.panel.PanelNice();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        panelNice7 = new org.edisoncor.gui.panel.PanelNice();
        panelNice8 = new org.edisoncor.gui.panel.PanelNice();
        buttonRound1 = new org.edisoncor.gui.button.ButtonRound();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                    .addComponent(panelNice5, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelNice3Layout.setVerticalGroup(
            panelNice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNice4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNice5, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelNice7.setLayout(new java.awt.GridLayout(20, 1));
        panelNice1.add(panelNice7, java.awt.BorderLayout.CENTER);

        buttonRound1.setText("Add");
        panelNice8.add(buttonRound1, java.awt.BorderLayout.CENTER);

        panelNice1.add(panelNice8, java.awt.BorderLayout.PAGE_END);

        panelNice2.setLayout(new java.awt.GridLayout(20, 1, 10, 10));

        javax.swing.GroupLayout panelNice6Layout = new javax.swing.GroupLayout(panelNice6);
        panelNice6.setLayout(panelNice6Layout);
        panelNice6Layout.setHorizontalGroup(
            panelNice6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNice1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelNice2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNice6Layout.setVerticalGroup(
            panelNice6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNice6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelNice2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNice6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelNice3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelNice3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNice6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    private void config(){
    	final ConfigDAO configDAO= new ConfigDAO();
    	panelNice7.removeAll();
    	try {
			List<ConfigDTO> listConfigDTO= configDAO.getListConfig(2);
	        for(final ConfigDTO configDTO:listConfigDTO){
	        	System.out.println("created config");
	        	Label config= new Label(configDTO);
	        	config.addMouseListener(new EventsConfig());
	        	panelNice7.add(config);	
	        }
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
    private void record(ConfigDTO configDTO) throws Exception{
    	RecordDAO recordDAO= new RecordDAO();
    	List<RecordDTO> listRecordDTO=recordDAO.getListRecord(1, configDTO.getId());
    	UserDAO userDAO= new UserDAO();
    	ConfigDAO configDAO= new ConfigDAO();
		panelNice2.removeAll();
		panelNice2.setLayout(new java.awt.GridLayout(20, 1));
		top=0;
		for(final RecordDTO recordDTO:listRecordDTO){
			System.out.println("created record");
			com.cm.sva.datamart.dto.complex.RecordDTO rec= new com.cm.sva.datamart.dto.complex.RecordDTO();
			rec.setDescription(recordDTO.getDescription());
			rec.setId(recordDTO.getId());
			rec.setName(recordDTO.getName());
			UserDTO userDTO= new UserDTO();
			userDTO.setId(recordDTO.getUserId());
			userDTO=userDAO.getUser(userDTO);
			rec.setUser(userDTO);
			ConfigDTO config= new ConfigDTO();
			config=configDAO.getConfigById(recordDTO.getConfigId());
			rec.setConfig(config);
                        rec.setImage(recordDTO.getImage());
			LabelRecord record= new LabelRecord(rec);
			System.out.println(System.getProperty("user.dir"));
			System.out.println(Principal.class.getResource("/buttonDark.png"));
//			ImageIcon image= new ImageIcon(Passwords.class.getResource("/buttonDark.png"));
//			record.setIcon(image);
//			record.setBounds(10, top+10, 200, 25);
			record.addMouseListener(new EventsRecord());
//                        panelNice2.set
			panelNice2.add(record);
//			top+=60;
		}
                p.repaint();
                p.setVisible(true);
		panelNice2.repaint();
		panelNice2.setVisible(true);
                
    }
    private void items(com.cm.sva.datamart.dto.complex.RecordDTO recordDTO){
    	ItemsDAO itemsDAO= new ItemsDAO();
    	ConfigDAO configDAO= new ConfigDAO();
		try{
			List <ItemsDTO> listItemsDTO=itemsDAO.getListRecord(recordDTO.getId());
			panelNice5.removeAll();
			top=0;
			for(final ItemsDTO itemsDTO:listItemsDTO){
				System.out.println("created items");
				ConfigDTO configDTO= new ConfigDTO();
				configDTO=configDAO.getConfigById(itemsDTO.getConfigId());
				JLabel items= new JLabel(configDTO.getName());
				items.setBounds(10, top+10, 200, 25);
				panelNice5.add(items);
				if(configDTO.getSecret().booleanValue()){
					HideText itemsValue= new HideText(itemsDTO);
                                        itemsValue.addMouseListener(new EventsItems());
					itemsValue.setBounds(210, top+10, 200, 25);
                                        Button b= new Button(itemsDTO);
                                        b.setBounds(420,top+10,20, 25);
					panelNice5.add(itemsValue);
                                        panelNice5.add(b);
				}
				else{
					Text itemsValue= new Text(itemsDTO);
					itemsValue.setBounds(210, top+10, 200, 25);
                                        itemsValue.addMouseListener(new EventsItems());
					panelNice5.add(itemsValue);
				}
				top+=60;
			}
			panelNice5.repaint();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}    	
    }
    class EventsConfig extends MouseAdapter{

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount()==1){
				panelNice2.removeAll();
//				panelNice2.setLayout(new java.awt.FlowLayout());
				try {
					record((ConfigDTO) ((Label) e.getSource()).getO());
					panelNice2.repaint();
					panelNice2.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			p.repaint();
			
		}
    }
    class EventsRecord extends MouseAdapter{
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		if(e.getClickCount()==1){
    			panelNice5.removeAll();
    			items((com.cm.sva.datamart.dto.complex.RecordDTO) ((LabelRecord) e.getSource()).getO());
                        ConfigDTO con= new ConfigDTO();
                        con.setName(((LabelRecord) e.getSource()).getO().getName());
                        con.setImage(((LabelRecord) e.getSource()).getO().getImage());
                        title=new Label(con);
//                        title.setO(con);
                        
                        title.repaint();
                        panelNice4.removeAll();
                        panelNice4.setLayout(new BorderLayout());
                        panelNice4.add(title);
    			panelNice5.repaint();
                        panelNice4.repaint();
                        p.repaint();
                        p.setVisible(true);
    		}
    	}
    }
    class EventsItems extends MouseAdapter{
    	@Override
    	public void mouseClicked(MouseEvent e) {
//    		super.mouseClicked(e);
            ItemsDTO itemDTO=null;
                if(e.getSource() instanceof Text){
                    itemDTO=(ItemsDTO) ((Text)e.getSource()).getO();
                    Text t=(Text) e.getSource();
                    t.setSelectionStart(0);
                    t.setSelectionEnd(t.getText().length());
                    
                }
                if(e.getSource() instanceof HideText){
                    itemDTO=(ItemsDTO) ((HideText)e.getSource()).getO();
                    HideText t=(HideText) e.getSource();
                    t.setSelectionStart(0);
                    t.setSelectionEnd(t.getText().length());
                    
                }
                StringSelection selection = new StringSelection(itemDTO.getValue());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(selection, selection);
    		System.out.println("xxx");
    	}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonRound buttonRound1;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private org.edisoncor.gui.panel.PanelNice panelNice3;
    private org.edisoncor.gui.panel.PanelNice panelNice4;
    private org.edisoncor.gui.panel.PanelNice panelNice5;
    private org.edisoncor.gui.panel.PanelNice panelNice6;
    private org.edisoncor.gui.panel.PanelNice panelNice7;
    private org.edisoncor.gui.panel.PanelNice panelNice8;
    // End of variables declaration//GEN-END:variables
}
