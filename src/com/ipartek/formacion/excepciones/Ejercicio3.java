package com.ipartek.formacion.excepciones;

import java.util.Scanner;

/**
 * Realice un m�todo que reciba como argumento un String y un n�mero y muestre
 * la letra de la posici�n indicada. Ll�melo pasando como par�metro un String
 * sin inicializar. Dicha llamada se encontrara dentro de un bloque try catch,
 * que en caso de producirse una excepci�n por un paso de par�metros a null, no
 * acabe con la ejecuci�n del programa. As� mismo, se controlara tambi�n que si
 * el numero pasado es mayor que el tama�o del string, capturara el error y nos
 * solicitara meter un numero valido, indic�ndonos los valores en los que puede
 * estar comprendido (para este apartado se le pasa como string la cadena de
 * texto �La lluvia en Sevilla no es una maravilla�)
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
