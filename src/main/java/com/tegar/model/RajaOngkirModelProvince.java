package com.tegar.model;

import java.io.Serializable;
import java.util.List;

public class RajaOngkirModelProvince implements Serializable{
	private static final long serialVersionUID = -3095910009165734896L;
	
	private List<String> query;
	
	private StatusModel status;
	
	private List<ProvinceResultsModel> results;

	public List<String> getQuery() {
		return query;
	}

	public void setQuery(List<String> query) {
		this.query = query;
	}

	public StatusModel getStatus() {
		return status;
	}

	public void setStatus(StatusModel status) {
		this.status = status;
	}

	public List<ProvinceResultsModel> getResults() {
		return results;
	}

	public void setResults(List<ProvinceResultsModel> results) {
		this.results = results;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public RajaOngkirModelProvince(List<String> query, StatusModel status, List<ProvinceResultsModel> results) {
		super();
		this.query = query;
		this.status = status;
		this.results = results;
	}

	public RajaOngkirModelProvince() {
		super();
	}

	
}
