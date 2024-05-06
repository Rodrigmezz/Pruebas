package com.rodrigo.dtos;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<PropietarioDTO> {

	@Override
	public int compare(PropietarioDTO o1, PropietarioDTO o2) {
		// TODO Auto-generated method stub
		return o1.getEdad().compareTo(o2.getEdad());
	}

	

	

	
	

	
	
	


}