package com.ipartek.formacion.excepciones;

import java.util.Scanner;

/**
 * Realice un programa que nos solicite por teclado dos números, y leerlos
 * usando la clase Scanner mediante la función nextLine(). Transformar ambos
 * strings a números enteros usando la siguiente sentencia
 * Integer.parseInt(numeroLeido). Agrupar el código entre un bloque try catch y
 * procesar para que no se produzca una interrupción y finalización del programa
 * si alguno de los números leídos no puede convertirse, retomando el control en
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
