
package com.rodrigo.dtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PropietarioDTO {

	private String dni;
	private String nombreApellido;
	private Integer edad;

	List<CocheDTO> listaCoches = new ArrayList<>();

	public PropietarioDTO(String dni, String nombreApellido, Integer edad) {
		super();
		this.dni = dni;
		this.nombreApellido = nombreApellido;
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public List<CocheDTO> getListaCoches() {
		return listaCoches;
	}

	public void setListaCoches(List<CocheDTO> listaCoches) {
		this.listaCoches = listaCoches;
	}

	@Override
	public String toString() {
		return "PropietarioDTO [dni=" + dni + ", nombreApellido=" + nombreApellido + ", edad=" + edad + ", listaCoches="
				+ listaCoches + "]";
	}

	@Override
	public int hashCode() {
		return nombreApellido.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		PropietarioDTO p = (PropietarioDTO) obj;
		return getNombreApellido().equals(p.getNombreApellido());
	}

	


}
