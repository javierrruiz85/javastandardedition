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
		coche.setColor(color = escaner.nextLine());

		// preguntar matricula
		System.out.println(" ");
		System.out.println("Matricula: ");
		coche.setMatricula(matricula = escaner.nextLine());

		// preguntar puertas y resto de atributos
		System.out.println(" ");
		System.out.println("Numero de puertas: ");
		coche.setNumeroPuertas(numeroPuertas = Integer.parseInt(escaner.nextLine()));

		System.out.println(" ");
		System.out.println("Numero de ruedas: ");
		coche.setNumeroRuedas(numeroRuedas = Integer.parseInt(escaner.nextLine()));

		System.out.println(" ");
		System.out.println("Potencia: ");
		coche.setPotencia(potencia = Float.parseFloat(escaner.nextLine()));

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
