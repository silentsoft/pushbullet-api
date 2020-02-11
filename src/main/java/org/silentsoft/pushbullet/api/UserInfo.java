package org.silentsoft.pushbullet.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfo {
	private boolean active;
	
	private String iden;
	
	private Number created;
	
	private Number modified;
	
	private String email;
	
	private String email_normalized;
	
	private String name;
	
	private String image_url;
	
	private Number max_upload_size;

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getIden() {
		return iden;
	}

	public void setIden(String iden) {
		this.iden = iden;
	}

	public Number getCreated() {
		return created;
	}

	public void setCreated(Number created) {
		this.created = created;
	}

	public Number getModified() {
		return modified;
	}

	public void setModified(Number modified) {
		this.modified = modified;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail_normalized() {
		return email_normalized;
	}

	public void setEmail_normalized(String email_normalized) {
		this.email_normalized = email_normalized;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public Number getMax_upload_size() {
		return max_upload_size;
	}

	public void setMax_upload_size(Number max_upload_size) {
		this.max_upload_size = max_upload_size;
	}
}