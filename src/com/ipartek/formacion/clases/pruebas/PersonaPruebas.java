package com.ipartek.formacion.clases.pruebas;

import com.ipartek.formacion.clases.Persona;

public class PersonaPruebas {

	public static void main(String[] args) {

		// usamos la palabra new para crear (instanciar) un objeto

		Persona adan = new Persona();
		adan.setNombre("Adan");
		adan.setEdad(48);

		System.out.println("mi nombre es " + adan.getNombre());
		System.out.println("y tengo " + adan.getEdad() + " años");

		Persona eva = new Persona();

		System.out.println(adan); // el syso hace un toString automatico
		System.out.println(eva.toString());

	}

}
