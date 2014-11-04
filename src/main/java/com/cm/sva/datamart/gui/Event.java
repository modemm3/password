package com.cm.sva.datamart.gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract  class Event implements MouseListener{

	public abstract void execute();

	public void mouseClicked(MouseEvent e) {
		if(e.getClickCount()==1)
			execute();
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
