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

		String cadena = "La lluvia en Sevilla no es una maravilla";
		int longitud = cadena.length();
		boolean continuar = true;

		System.out.println("Dame el numero de una posicion para ver a que letra corresponde: ");
		String posicion = escaner.nextLine();
		int posicionCadena = Integer.parseInt(posicion);

		System.out.println(longitud);

		escaner.close();

	}

}
