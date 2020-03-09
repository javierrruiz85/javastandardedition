package com.ipartek.formacion.excepciones;

import java.util.Scanner;

/**
 * Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego
 * calcule “a/b”. Pruebe a introducir b=0 y ver que hace el programa con la
 * división por cero. Pruebe a introducir b=”Carlos” para ver cómo se comporta
 * el programa. Añada excepciones para recoger estas excepciones y avisar del
 * problema al usuario
 * 
 * @author Curso
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);

		try {
			System.out.println("dame un numero: ");
			String a = escaner.nextLine();
			int numA = Integer.parseInt(a);
			System.out.println("Dame otro numero: ");
			String b = escaner.nextLine();
			int numB = Integer.parseInt(b);
			int resultado = numA / numB;
			System.out.println("El resultado de dividir " + a + " / " + b + " es " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por 0");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Alguno de los dos no es un numero");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Excepcion no controlada");
		} finally {
			escaner.close();
		}

	}

}
