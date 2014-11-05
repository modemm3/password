package com.cm.sva.datamart.gui.components;

import org.edisoncor.gui.label.LabelTask;

import com.cm.sva.datamart.dto.DTO;

public class Label extends LabelTask {
	private static final long serialVersionUID = 1L;
	DTO o;

	public Label(DTO o) {
		super(o.getName());
		this.o = o;
	}

	public DTO getO() {
		return o;
	}

	public void setO(DTO o) {
		this.o = o;
	}
	
}
