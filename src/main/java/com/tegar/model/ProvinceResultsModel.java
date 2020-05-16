package com.tegar.model;

public class ProvinceResultsModel {
	private String province_id;
	
	private String province;

	public String getProvince_id() {
		return province_id;
	}

	public void setProvince_id(String province_id) {
		this.province_id = province_id;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public ProvinceResultsModel(String province_id, String province) {
		super();
		this.province_id = province_id;
		this.province = province;
	}

	public ProvinceResultsModel() {
		super();
	}
	
}
