package uf2404;

import java.util.Scanner;

public class PreguntarNumero {

	public static void main(String[] args) {

		System.out.println("Dime un numero:");

		Scanner teclado = new Scanner(System.in);

		int numero = teclado.nextInt();

		if (numero == 0) {
			System.out.println("Es cero");

		} else if (numero % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}

		teclado.close();

	}

}
