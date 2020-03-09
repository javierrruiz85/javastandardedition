package com.ipartek.formacion.excepciones;

import java.util.Scanner;

/**
 * Realice un método que reciba como argumento un String y un número y muestre
 * la letra de la posición indicada. Llámelo pasando como parámetro un String
 * sin inicializar. Dicha llamada se encontrara dentro de un bloque try catch,
 * que en caso de producirse una excepción por un paso de parámetros a null, no
 * acabe con la ejecución del programa. Así mismo, se controlara también que si
 * el numero pasado es mayor que el tamaño del string, capturara el error y nos
 * solicitara meter un numero valido, indicándonos los valores en los que puede
 * estar comprendido (para este apartado se le pasa como string la cadena de
 * texto “La lluvia en Sevilla no es una maravilla”)
 * 
 * @author Curso
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);

		String cadena;
		int longitud = 0;
		boolean continuar = true;

		do {
			try {
				System.out.println("Escribeme una frase: ");
				cadena = escaner.nextLine();
				longitud = cadena.length();

				System.out.println("Dame el numero de una posicion para ver a que letra corresponde: ");
				String posicion = escaner.nextLine();
				int posicionCadena = Integer.parseInt(posicion);
				int posCadena = posicionCadena - 1;

				System.out.println("La letra en la posicion " + posicion + " es la '" + cadena.charAt(posCadena) + "'");
				continuar = false;

			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("Dame un numero comprendido entre 1 y " + longitud);

			} catch (NullPointerException e) {
				System.out.println("Error, debes escribir una frase completa.");

			} catch (Exception e) {
				System.out.println("Excepcion no controlada");

			}
		} while (continuar);

		escaner.close();

	}

}
