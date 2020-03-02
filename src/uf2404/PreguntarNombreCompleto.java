package uf2404;

import java.util.Scanner;

public class PreguntarNombreCompleto {

	public static void main(String[] args) {

		System.out.println("Dime tu nombre:");
		Scanner teclado = new Scanner(System.in);
		String nombre = teclado.nextLine();

		System.out.println("Dime tu primer apellido:");

		String apellido1 = teclado.nextLine();

		System.out.println("Dime tu segundo apellido:");

		String apellido2 = teclado.nextLine();

		System.out.println("Tu nombre completo es " + nombre + apellido1 + apellido2);

		teclado.close();

	}

}
