package com.cm.sva.datamart.gui.components;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.edisoncor.gui.label.LabelTask;

import com.cm.sva.datamart.dto.DTO;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Text extends JTextField {
	private static final long serialVersionUID = 1L;
	DTO o;

	public Text(DTO o) {
		super(o.getName());
                setFont(new Font("arial", 1, 10));
		this.o = o;
                
	}

	public DTO getO() {
		return o;
	}

	public void setO(DTO o) {
		this.o = o;
	}
	
}
