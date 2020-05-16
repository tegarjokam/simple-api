package com.tegar.model;

import java.io.Serializable;

public class StatusModel implements Serializable{
	private static final long serialVersionUID = -8461685222870446542L;
	
	private int code;
	
	private String description;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public StatusModel(int code, String description) {
		super();
		this.code = code;
		this.description = description;
	}

	public StatusModel() {
		super();
	}
	
	

}
