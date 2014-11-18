package com.cm.sva.datamart.gui.components;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.edisoncor.gui.label.LabelTask;

import com.cm.sva.datamart.dto.DTO;
import java.awt.Font;

public class Label extends LabelTask {
	private static final long serialVersionUID = 1L;
	DTO o;

	public Label(DTO o) {
		super(o.getName());
                setFont(new Font("arial", 1, 8));
		this.o = o;
                this.setOpaque(true);
                if(o.getImage()!=null)
                    try{
                this.setIcon(new javax.swing.ImageIcon(getClass().getResource(o.getImage())));
                    }
                catch(Exception ex){
                }
	}

	public DTO getO() {
		return o;
	}

	public void setO(DTO o) {
		this.o = o;
	}
	
}
