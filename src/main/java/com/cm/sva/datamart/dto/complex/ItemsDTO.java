package com.cm.sva.datamart.dto.complex;

import com.cm.sva.datamart.dto.ConfigDTO;

public class ItemsDTO {

	private Integer id;
	private ConfigDTO config;
	private String value;
	private RecordDTO record;
	public ItemsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemsDTO(Integer id, ConfigDTO config, String value, RecordDTO record) {
		super();
		this.id = id;
		this.config = config;
		this.value = value;
		this.record = record;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ConfigDTO getConfig() {
		return config;
	}
	public void setConfig(ConfigDTO config) {
		this.config = config;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public RecordDTO getRecord() {
		return record;
	}
	public void setRecord(RecordDTO record) {
		this.record = record;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ItemsDTO [id=");
		builder.append(id);
		builder.append(", config=");
		builder.append(config);
		builder.append(", value=");
		builder.append(value);
		builder.append(", record=");
		builder.append(record);
		builder.append("]");
		return builder.toString();
	}
	
}
