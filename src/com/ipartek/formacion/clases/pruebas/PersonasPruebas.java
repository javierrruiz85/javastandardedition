package com.ipartek.formacion.clases.pruebas;

import com.ipartek.formacion.clases.Alumno;
import com.ipartek.formacion.clases.Profesor;

public class PersonasPruebas {

	public static void main(String[] args) {

		Profesor profesor1 = new Profesor();
		Profesor profesor2 = new Profesor();
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno();
		Alumno alumno3 = new Alumno();

		profesor1.setNombre("Ander");
		profesor1.setAltura(1.70f);
		profesor1.setEdad(30);
		profesor1.setGenero("Masculino");
		profesor1.setRaza("Caucasico");
		profesor1.setSueldo(45000f);
		profesor1.setMateria("Java");

		profesor2.setNombre("Sara");
		profesor2.setAltura(1.75f);
		profesor2.setEdad(24);
		profesor2.setGenero("Femenino");
		profesor2.setRaza("Caucasica");
		profesor2.setSueldo(25000f);
		profesor2.setMateria("Office");

		alumno1.setNombre("Luis");
		alumno1.setAltura(1.80f);
		alumno1.setEdad(35);
		alumno1.setGenero("Masculino");
		alumno1.setRaza("Caucasico");
		alumno1.setEmail("luis@correo.com");
		alumno1.setGithub("lusitiogit");
		alumno1.setNota(4.5f);

		alumno2.setNombre("Pedro");
		alumno2.setAltura(1.85f);
		alumno2.setEdad(39);
		alumno2.setGenero("Masculino");
		alumno2.setRaza("Caucasico");
		alumno2.setEmail("pedro@correo.es");
		alumno2.setGithub("pedritogit");
		alumno2.setNota(6.5f);

		alumno3.setNombre("Laura");
		alumno3.setAltura(1.65f);
		alumno3.setEdad(23);
		alumno3.setGenero("Femenino");
		alumno3.setRaza("Caucasica");
		alumno3.setEmail("laura@correo.net");
		alumno3.setGithub("lauritagit");
		alumno3.setNota(8.5f);

		System.out.println("Ander: " + profesor1.getNombre() + " , Sueldo: " + profesor1.getSueldo() + " €, Materia: " + profesor1.getMateria());
		System.out.println("La profesora " + profesor2.getNombre() + " tiene a los alumnos " + alumno1.getNombre() + ", " + alumno2.getNombre() + "; " + alumno3.getNombre());
		System.out.println(alumno3.toString());

	}

}
