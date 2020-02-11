package org.silentsoft.pushbullet.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Device {
	private boolean active;
	
	private String iden;
	
	private Number created;
	
	private Number modified;
	
	private String type;
	
	private String kind;
	
	private String nickname;
	
	private String manufacturer;
	
	private String model;
	
	private String app_version;
	
	private String fingerprint;
	
	private boolean pushable;
	
	private String icon;
	
	private String remote_files;

	public boolean isActive() {
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getApp_version() {
		return app_version;
	}

	public void setApp_version(String app_version) {
		this.app_version = app_version;
	}

	public String getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public boolean isPushable() {
		return pushable;
	}

	public void setPushable(boolean pushable) {
		this.pushable = pushable;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getRemote_files() {
		return remote_files;
	}

	public void setRemote_files(String remote_files) {
		this.remote_files = remote_files;
	}
}
