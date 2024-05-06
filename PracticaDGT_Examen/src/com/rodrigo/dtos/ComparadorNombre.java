package com.rodrigo.dtos;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<PropietarioDTO> {

	@Override
	public int compare(PropietarioDTO o1, PropietarioDTO o2) {
		// TODO Auto-generated method stub
		return o1.getNombreApellido().compareTo(o2.getNombreApellido());
	}

}
