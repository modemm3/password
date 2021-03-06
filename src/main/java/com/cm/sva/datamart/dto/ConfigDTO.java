package com.cm.sva.datamart.dto;

public class ConfigDTO implements DTO{

	private String id;
	private String name;
	private String description;
	private Boolean secret;
        private String image;
	private Boolean parent;
	public ConfigDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConfigDTO(String id, String name, String description, Boolean secret,String image,Boolean parent) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.secret = secret;
                this.image=image;
                this.parent=parent;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public Boolean getSecret() {
		return secret;
	}
	public void setSecret(Boolean secret) {
		this.secret = secret;
	}

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getParent() {
        return parent;
    }

    public void setParent(Boolean parent) {
        this.parent = parent;
    }
        
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ConfigDTO [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", secret=");
		builder.append(secret);
		builder.append(", image=");
		builder.append(image);
		builder.append(", parent=");
		builder.append(parent);
                builder.append("]");
		return builder.toString();
	}
	
}
