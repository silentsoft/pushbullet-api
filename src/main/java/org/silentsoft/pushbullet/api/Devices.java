package org.silentsoft.pushbullet.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Do not use 'public' keyword at this class b/c encapsulation for information hiding.
 * @author silentsoft
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class Devices {
	private List<Device> devices;

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
}
