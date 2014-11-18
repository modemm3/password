package com.cm.sva.datamart.gui.components;



import com.cm.sva.datamart.dto.DTO;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.plaf.BorderUIResource;
import org.edisoncor.gui.button.ButtonTask;
import org.edisoncor.gui.label.LabelHeader;
import org.edisoncor.gui.label.LabelRound;
import org.edisoncor.gui.label.LabelTask;

public class LabelRecord extends ButtonTask {
	private static final long serialVersionUID = 1L;
	DTO o;

	public LabelRecord(DTO o) {
            this.setText(o.getName());
            this.setOpaque(true);
//		super(o.getName());
//                setFont(new Font("arial", 1, 8));
		this.o = o;
//                setFont(new java.awt.Font("Arial", 1, 10));
//                setRedondeado(true);
//                setColorDeBorde(Color.white);
//                setColorDeSegundoBorde(Color.black);
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
