package com.ipartek.formacion.clases;

import java.util.Scanner;

public class ArrayPaisesPrueba {

	public static void main(String[] args) {

		int totalCasos = 0;

		// declarar un Array
		ArrayPaises[] paises = new ArrayPaises[5];
		/*
		 * ArrayPaises p = new ArrayPaises(); p.setNombre("España"); p.setNumCasos(120);
		 * paises[0] = p;
		 * 
		 * p = new ArrayPaises(); p.setNombre("Francia"); p.setNumCasos(14); paises[1] =
		 * p;
		 * 
		 * p = new ArrayPaises(); p.setNombre("Alemania"); p.setNumCasos(0); paises[2] =
		 * p;
		 * 
		 * p = new ArrayPaises(); p.setNombre("Noruega"); p.setNumCasos(2); paises[3] =
		 * p;
		 * 
		 * p = new ArrayPaises(); p.setNombre("Italia"); p.setNumCasos(400); paises[4] =
		 * p;
		 */

		for (int i = 0; i < paises.length; i++) {

			System.out.println("Dame el nombre de un pais: ");
			Scanner teclado = new Scanner(System.in);
			String nombrePais = teclado.nextLine();

			System.out.println("Dame el total de infectados de ese pais: ");
			int totalInfectados = teclado.nextInt();

			ArrayPaises p = new ArrayPaises();
			p.setNombre(nombrePais);
			p.setNumCasos(totalInfectados);
			paises[i] = p;

			teclado.close();

		}

		for (int i = 0; i < paises.length; i++) {
			// System.out.println("En " + paises[i].getNombre() + " hay " +
			// paises[i].getNumCasos() + " infectados");

			totalCasos = totalCasos + paises[i].getNumCasos();

			if (paises[i].getNumCasos() > 0) {
				System.out.println("En " + paises[i].getNombre() + " hay " + paises[i].getNumCasos() + " infectados");
			} else {
				System.out.println("En " + paises[i].getNombre() + " no hay infectados");

			}

		}
		System.out.println("");
		System.out.println("Hay " + totalCasos + " casos en total");

		/*
		 * for (int i = 0; i < paises.length; i++) { if ( > 0) {
		 * 
		 * } }
		 */

	}

}
