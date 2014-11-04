package com.cm.sva.datamart.dto;

public class RecordDTO {

	private Integer id;
	private String name;
	private String description;
	private Integer userId;
	public RecordDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RecordDTO(Integer id, String name, String description, Integer userId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.userId = userId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RecordDTO [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", userId=");
		builder.append(userId);
		builder.append("]");
		return builder.toString();
	}
	
}
