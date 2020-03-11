package com.ipartek.formacion.clases.pruebas;

import java.util.Scanner;

import com.ipartek.formacion.clases.Pais;

// utiliza la clase "Pais"

public class ArrayPaisesPrueba {

	public static void main(String[] args) {

		int totalCasos = 0;
		Scanner teclado = new Scanner(System.in);

		// declarar un Array
		Pais[] paises = new Pais[5];

		for (int i = 0; i < paises.length; i++) {

			System.out.println("Dame el nombre de un pais: ");

			String nombrePais = teclado.nextLine();

			System.out.println("Dame el total de infectados de ese pais: ");
			String totalInfectados = teclado.nextLine();
			int parse_totalInfectados = Integer.parseInt(totalInfectados);

			Pais p = new Pais();
			p.setNombre(nombrePais);
			p.setNumeroInfectados(parse_totalInfectados);
			paises[i] = p;

		}

		for (int i = 0; i < paises.length; i++) {
			totalCasos = totalCasos + paises[i].getNumeroInfectados();

			if (paises[i].getNumeroInfectados() > 0) {
				System.out.println(
						"En " + paises[i].getNombre() + " hay " + paises[i].getNumeroInfectados() + " infectados");
			} else {
				System.out.println("En " + paises[i].getNombre() + " no hay infectados");
			}

		}
		System.out.println("");
		System.out.println("Hay " + totalCasos + " casos en total");

		teclado.close();

	}

}
