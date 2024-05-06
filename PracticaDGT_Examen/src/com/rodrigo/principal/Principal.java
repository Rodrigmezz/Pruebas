package com.rodrigo.principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import com.rodrigo.dtos.CocheDTO;
import com.rodrigo.dtos.ComparadorDni;
import com.rodrigo.dtos.ComparadorEdad;
import com.rodrigo.dtos.ComparadorKilometros;
import com.rodrigo.dtos.ComparadorNombre;
import com.rodrigo.dtos.Constantes;
import com.rodrigo.dtos.PropietarioDTO;

public class Principal {

	public static void main(String[] args) throws IOException {

		List<PropietarioDTO> listaPropietario = new ArrayList<>();

		File f = new File(Constantes.DIRECTORIO_PROPIETARIOS);

		BufferedReader br = new BufferedReader(new FileReader(f));

		String linea;

		while ((linea = br.readLine()) != null) {

			String[] arrayToken = linea.split("-");

			PropietarioDTO propietario = new PropietarioDTO(arrayToken[0], arrayToken[1],
					Integer.parseInt(arrayToken[2]));

			listaPropietario.add(propietario);
		}

		f = new File(Constantes.DIRECTORIO_COCHES);

		br = new BufferedReader(new FileReader(f));

		while ((linea = br.readLine()) != null) {

			String[] arrayToken = linea.split("-");

			CocheDTO coche = new CocheDTO(arrayToken[0], arrayToken[1], Float.parseFloat(arrayToken[2]));

			for (PropietarioDTO propietario : listaPropietario) {
				if (coche.getDni().equalsIgnoreCase(propietario.getDni())) {
					propietario.getListaCoches().add(coche);
				}
			}

		}

		System.out.println();
		System.err.println("Lista de coches con sus respectivos propietarios");
		System.out.println();

		for (PropietarioDTO propietario : listaPropietario) {
			System.out.println(propietario);
		}
		System.out.println();
		System.err.println("Lista con propietarios ordenador por edad de menor a mayor");
		System.out.println();
		Collections.sort(listaPropietario, new ComparadorEdad());

		for (PropietarioDTO propietario : listaPropietario) {
			System.out.println(propietario);
		}

		System.out.println();
		System.err.println("Lista con propietarios ordenador por orden alfabetico");
		System.out.println();
		Collections.sort(listaPropietario, new ComparadorNombre());

		for (PropietarioDTO propietario : listaPropietario) {
			System.out.println(propietario);
		}

		System.out.println();
		System.err.println("Lista con propietarios ordenador por orden de DNI");
		System.out.println();
		Collections.sort(listaPropietario, new ComparadorDni());

		for (PropietarioDTO propietario : listaPropietario) {
			System.out.println(propietario);
		}

		System.out.println();
		System.err.println("Lista con propietarios ordenador por kilometros");
		System.out.println();
		Collections.sort(listaPropietario, new ComparadorKilometros());

		for (PropietarioDTO propietario : listaPropietario) {
			System.out.println(propietario);
		}

		HashSet<PropietarioDTO> conjuntoPropietarios = new HashSet<>(listaPropietario);

		System.out.println();

		System.err.println("Imprimir listra sin usuarios repetidos");
		System.out.println();
		for (PropietarioDTO p : conjuntoPropietarios) {
			System.out.println(p);
		}

	}

}
