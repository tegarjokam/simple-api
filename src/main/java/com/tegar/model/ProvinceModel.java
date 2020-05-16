package com.tegar.model;

import java.io.Serializable;

public class ProvinceModel implements Serializable{
	private static final long serialVersionUID = -5084850085018662647L;
	
	private RajaOngkirModel rajaongkir;

	public RajaOngkirModel getRajaongkir() {
		return rajaongkir;
	}

	public void setRajaongkir(RajaOngkirModel rajaongkir) {
		this.rajaongkir = rajaongkir;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ProvinceModel(RajaOngkirModel rajaongkir) {
		super();
		this.rajaongkir = rajaongkir;
	}

	public ProvinceModel() {
	}
	
	
}
