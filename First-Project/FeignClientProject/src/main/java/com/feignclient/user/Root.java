package com.feignclient.user;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {

	@JsonProperty("data")
	public ArrayList<Data> data;
	
}
