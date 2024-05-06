package com.rodrigo.dtos;

import java.util.Comparator;

public class ComparadorKilometros implements Comparator<PropietarioDTO> {


	@Override
	public int compare(PropietarioDTO o1, PropietarioDTO o2) {
		// TODO Auto-generated method stub
		;
		return Integer.valueOf(o2.getListaCoches().size()).compareTo(o1.getListaCoches().size());
	}

	

}
