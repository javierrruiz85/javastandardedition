package com.ipartek.formacion.excepciones;

import java.util.Random;
import java.util.Scanner;

/**
 * Realizar un programa que lance un número aleatorio del 1 al 6. Según el
 * número sacado, se lanzara una excepción u otra de la siguiente lista: *
 * <ol>
 * <li>1: ArithmeticException</li>
 * <li>2: NullpointerException</li>
 * <li>3: NumberFormatException</li>
 * <li>4: SecurityException</li>
 * <li>5: NegativeArrayException</li>
 * <li>6: IOException</li>
 * </ol>
 * Haciendo uso del try y del catch, mostrar un mensaje por pantalla y explicar
 * cuál es la excepción ocurrida. Repetir este proceso de manera indefinida,
 * controlando dichas excepciones y sin dar pie a que el programa se cuelgue
 * 
 * 
 * @author Curso
 *
 */

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);
		boolean continuar = true;

		do {

			Random rand = new Random();
			int rand_numero = rand.nextInt(5);

			switch (rand_numero) {
			case 0:
				System.out.println("opcion 1");
				throw new ArithmeticException("Por ejemplo, dividir entre 0");

			// break;

			case 1:
				System.out.println("opcion 2");

				break;

			case 2:
				System.out.println("opcion 3");

				break;

			case 3:
				System.out.println("opcion 4");

				break;

			case 4:
				System.out.println("opcion 5");

				break;

			case 5:
				System.out.println("opcion 6");

				break;

			default:

				break;
			}

			System.out.println("¿Quieres ver mas tipos de excepciones? Escribe '0' para ver otros tipos y '1' para salir: ");
			int opcion = escaner.nextInt();

			if (opcion != 0) {
				continuar = false;
			} else {
				System.out.println("Hasta luego");
			}
		} while (continuar);

		escaner.close();

	}

}
