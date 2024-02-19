package com.feignclient.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

	@JsonProperty("iso")
	public String iso;
	
	@JsonProperty("name")
	public String name;

	public String getIso() {
		return iso;
	}

	public void setIso(String iso) {
		this.iso = iso;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
