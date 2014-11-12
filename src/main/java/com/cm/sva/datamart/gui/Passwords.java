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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.cm.sva.datamart.dao.ConfigDAO;
import com.cm.sva.datamart.dao.ItemsDAO;
import com.cm.sva.datamart.dao.RecordDAO;
import com.cm.sva.datamart.dao.UserDAO;
import com.cm.sva.datamart.dao.config.ConfigurationLoader;
import com.cm.sva.datamart.dto.ConfigDTO;
import com.cm.sva.datamart.dto.ItemsDTO;
import com.cm.sva.datamart.dto.RecordDTO;
import com.cm.sva.datamart.dto.UserDTO;
import com.cm.sva.datamart.gui.components.Label;

/**
 *
 * @author Modesto Mejia Martinez
 */
public class Passwords extends javax.swing.JFrame {


	private JPanel panelNice1;
    private JPanel panelNice2;
    private JPanel panelNice3;
    private JPanel panelNice4;
    private JPanel panelNice5;
    Passwords p=this;
	private int top=0;
    public Passwords() {
        initComponents();
        try{
        	config();
	        this.setVisible(true);
	        panelNice1.setBackground(new Color(120, 120, 120));
	        panelNice2.setBackground(new Color(120, 120, 120));
	        panelNice3.setBackground(new Color(120, 120, 120));
	        panelNice4.setBackground(new Color(120, 120, 120));
	        panelNice5.setBackground(new Color(120, 120, 120));        
	        panelNice1.repaint();
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        catch(Exception ex){
        	ex.printStackTrace();
        }
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        panelNice1 = new JPanel();
        panelNice2 = new JPanel();
        panelNice3 = new JPanel();
        panelNice4 = new JPanel();
        panelNice5 = new JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

//        panelNice1.setLayout(new java.awt.FlowLayout());
        panelNice1.setLayout(new java.awt.GridLayout(20, 1));

        panelNice2.setLayout(new java.awt.GridLayout(20, 1));

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
                .addComponent(panelNice2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    public static void main(String args[]) {
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Passwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Passwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Passwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Passwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        java.awt.EventQueue.invokeLater(new Runnable() {

//            public void run() {
                new Passwords().setVisible(true);
//            }
//        });
    }

    
    private void config(){
    	final ConfigDAO configDAO= new ConfigDAO();
    	panelNice1.removeAll();
    	try {
			List<ConfigDTO> listConfigDTO= configDAO.getListConfig(2);
	        for(final ConfigDTO configDTO:listConfigDTO){
	        	System.out.println("created config");
	        	Label config= new Label(configDTO);
	        	config.addMouseListener(new EventsConfig());
	        	panelNice1.add(config);	
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
			Label record= new Label(rec);
			System.out.println(System.getProperty("user.dir"));
			System.out.println(Passwords.class.getResource("/buttonDark.png"));
//			ImageIcon image= new ImageIcon(Passwords.class.getResource("/buttonDark.png"));
//			record.setIcon(image);
//			record.setBounds(10, top+10, 200, 25);
			record.addMouseListener(new EventsRecord());
			panelNice2.add(record);
//			top+=60;
		}
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
				panelNice2.setLayout(new java.awt.FlowLayout());
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
    			items((com.cm.sva.datamart.dto.complex.RecordDTO) ((Label) e.getSource()).getO());
    			panelNice5.repaint();
    			
    		}
    	}
    }
    class EventsItems extends MouseAdapter{
    	@Override
    	public void mouseClicked(MouseEvent e) {
//    		super.mouseClicked(e);
    		System.out.println("xxx");
    	}
    }
}
