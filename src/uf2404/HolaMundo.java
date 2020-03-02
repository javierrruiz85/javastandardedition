package uf2404;

/*
 * Esto es un comentario de bloque
 * podemos escribir varias lineas de codigo
 */

/**
 * JavaDoc es para documentar el codigo fuente o src
 * 
 * @author Curso
 *
 */

// todo nuestro codigo a ejecutar debe estar dentro del main
public class HolaMundo {

	// Las clases empiezan con mayuscula y CamelCase
	// Las variables empiezan con minuscula y PascalCase

	public static void main(String[] args) {

		// String: es el tipo de la variable
		// persona: nombre de la variable
		// "Ander": es el valor que asignamos a la variable

		String persona = "Ander";
		int edad = 39;
		float altura = 1.70f; // hay que poner una f al final o (float)por delante
		// float otraAltura = (float) 1.70;
		boolean isGoodDay = false; // casi todas las variables booleanas comienzan con is

		// usamos el operador + para concatenar string o cadenas de texto
		System.out.println("Mi nombre es " + persona);
		System.out.println("Mi edad es " + edad);
		System.out.println("Mi altura es " + altura + " metros");

		if (isGoodDay) {
			System.out.println("Hoy tengo un dia bueno");
		} else {
			System.out.println("Hoy es un dia de mierda");
		}

	} // final metodo main

} // final de la clase
