package com.ipartek.formacion.clases.pruebas;

import java.util.Scanner;

import com.ipartek.formacion.clases.Vehiculo;

public class ConfiguradorVehiculos {

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);

		String color = "";
		String matricula = "";
		int numeroRuedas = 0;
		int numeroPuertas = 0;
		float potencia = 0;

		Vehiculo coche = new Vehiculo();

		// preguntar por consola como quiere el Vehiculo
		System.out.println("Configure su coche: ");

		// preguntar color
		System.out.println(" ");
		System.out.println("Color: ");
		// coche.setColor(color = escaner.nextLine());
		color = escaner.nextLine();
		coche.setColor(color);

		// preguntar matricula
		System.out.println(" ");
		System.out.println("Matricula: ");
		matricula = escaner.nextLine();
		coche.setMatricula(matricula);

		// preguntar puertas y resto de atributos
		System.out.println(" ");
		System.out.println("Numero de puertas: ");
		numeroPuertas = Integer.parseInt(escaner.nextLine());
		coche.setNumeroPuertas(numeroPuertas);

		System.out.println(" ");
		System.out.println("Numero de ruedas: ");
		numeroRuedas = Integer.parseInt(escaner.nextLine());
		coche.setNumeroRuedas(numeroRuedas);

		System.out.println(" ");
		System.out.println("Potencia: ");
		potencia = Float.parseFloat(escaner.nextLine());
		coche.setPotencia(potencia);

		// mostrar uno a uno todos los atriibutos por consola
		System.out.println(" ");
		System.out.println("**************************************************");
		System.out.println("Los datos de su coche son: ");

		System.out.println("color: " + coche.getColor());
		System.out.println("matricula: " + coche.getMatricula());
		System.out.println("puertas: " + coche.getNumeroPuertas());
		System.out.println("ruedas: " + coche.getNumeroRuedas());
		System.out.println("potencia: " + coche.getPotencia() + " CV");

		escaner.close();

	}

}
