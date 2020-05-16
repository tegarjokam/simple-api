package com.tegar.model;

import java.io.Serializable;
import java.util.List;

public class RajaOngkirModelCity implements Serializable{
	private static final long serialVersionUID = -8616952936464928390L;
	
	private List<String> query;
	
	private StatusModel status;
	
	private List<CityResultsModel> results;

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

	public List<CityResultsModel> getResults() {
		return results;
	}

	public void setResults(List<CityResultsModel> results) {
		this.results = results;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public RajaOngkirModelCity(List<String> query, StatusModel status, List<CityResultsModel> results) {
		super();
		this.query = query;
		this.status = status;
		this.results = results;
	}

	public RajaOngkirModelCity() {
		super();
	}
}
