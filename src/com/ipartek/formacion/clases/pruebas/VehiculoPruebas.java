package com.ipartek.formacion.clases.pruebas;

import com.ipartek.formacion.clases.Vehiculo;

public class VehiculoPruebas {

	public static void main(String[] args) {

		Vehiculo v1 = new Vehiculo();
		Vehiculo v2 = new Vehiculo("negro", "1234 ABC");
		Vehiculo v3 = new Vehiculo("blanco", "7890 XYZ", 5);

		System.out.println(v1.toString());
		System.out.println(v2);
		System.out.println(v3);

		// vamos a pintar el coche v1
		v1.setColor("rojo");

		// vamos a matricularlo v1
		v1.setMatricula("5678 DEF");

		System.out.println("Despues de pintar y matricular v1");
		System.out.println("color: " + v1.getColor());
		System.out.println("matricula: " + v1.getMatricula());
		System.out.println("puertas: " + v1.getNumeroPuertas());
		System.out.println("ruedas: " + v1.getNumeroRuedas());
		System.out.println("potencia: " + v1.getPotencia() + " CV");

	}

}
