package com.cm.sva.datamart.dto.complex;

import com.cm.sva.datamart.dto.ConfigDTO;
import com.cm.sva.datamart.dto.DTO;
import com.cm.sva.datamart.dto.UserDTO;

public class RecordDTO implements DTO{
	private Integer id;
	private String name;
	private String description;
	private UserDTO user;
	private ConfigDTO config;
	public RecordDTO() {
		super();
	}
	public RecordDTO(Integer id, String name, String description, UserDTO user,
			ConfigDTO config) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.user = user;
		this.config = config;
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
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public ConfigDTO getConfig() {
		return config;
	}
	public void setConfig(ConfigDTO config) {
		this.config = config;
	}
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RecordDTO [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", user=");
		builder.append(user);
		builder.append(", config=");
		builder.append(config);
		builder.append("]");
		return builder.toString();
	}
	
	
}
