package com.ipartek.formacion.excepciones;

import java.util.Scanner;

/**
 * Realice un programa que nos solicite por teclado dos n�meros, y leerlos
 * usando la clase Scanner mediante la funci�n nextLine(). Transformar ambos
 * strings a n�meros enteros usando la siguiente sentencia
 * Integer.parseInt(numeroLeido). Agrupar el c�digo entre un bloque try catch y
 * procesar para que no se produzca una interrupci�n y finalizaci�n del programa
 * si alguno de los n�meros le�dos no puede convertirse, retomando el control en
 * el punto del fallo, hasta que se solucione
 * 
 * @author Curso
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);

		boolean continuar = true;

		do {
			try {
				System.out.println("Dame un numero: ");
				String numeroLeido1 = escaner.nextLine();
				int num1 = Integer.parseInt(numeroLeido1);

				System.out.println("Dame otro numero: ");
				String numeroLeido2 = escaner.nextLine();
				int num2 = Integer.parseInt(numeroLeido2);

				System.out.println("Los numeros introducidos han sido " + num1 + " y " + num2);

				continuar = false;

			} catch (Exception e) {
				System.out.println("Alguno de los numeros introducidos no es correcto");
			}

		} while (continuar);

		escaner.close();

	}

}
