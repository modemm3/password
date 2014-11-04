package com.cm.sva.datamart.dto;

public class ItemsDTO {
	private Integer id;
	private String configId;
	private String value;
	private Integer recordId;
	public ItemsDTO() {
	}
	public ItemsDTO(Integer id, String configId, String value, Integer recordId) {
		super();
		this.id = id;
		this.configId = configId;
		this.value = value;
		this.recordId = recordId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getConfigId() {
		return configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Integer getRecordId() {
		return recordId;
	}
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ItemsDTO [id=");
		builder.append(id);
		builder.append(", configId=");
		builder.append(configId);
		builder.append(", value=");
		builder.append(value);
		builder.append(", recordId=");
		builder.append(recordId);
		builder.append("]");
		return builder.toString();
	}
	
}
