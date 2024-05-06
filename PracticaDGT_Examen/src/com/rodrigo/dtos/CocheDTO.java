package com.rodrigo.dtos;

import java.util.ArrayList;
import java.util.List;

public class CocheDTO {

	private String dni;
	private String marca;
	private float kilometros;
	
	

	public CocheDTO(String dni, String marca, float kilometros) {
		super();
		this.dni = dni;
		this.marca = marca;
		this.kilometros = kilometros;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getKilometros() {
		return kilometros;
	}

	public void setKilometros(float kilometros) {
		this.kilometros = kilometros;
	}

	@Override
	public String toString() {
		return "CocheDTO [dni=" + dni + ", marca=" + marca + ", kilometros=" + kilometros + "]";
	}

	

	

	
	
}
