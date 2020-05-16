package com.tegar.model;

import java.io.Serializable;

public class CityModel implements Serializable{
	private static final long serialVersionUID = 2180069807209280132L;
	
	private RajaOngkirModelCity rajaongkir;

	public RajaOngkirModelCity getRajaongkir() {
		return rajaongkir;
	}

	public void setRajaongkir(RajaOngkirModelCity rajaongkir) {
		this.rajaongkir = rajaongkir;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public CityModel(RajaOngkirModelCity rajaongkir) {
		super();
		this.rajaongkir = rajaongkir;
	}

	public CityModel() {
		super();
	}
	
	
}
