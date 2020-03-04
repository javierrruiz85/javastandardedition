package ejercicio.general;

import java.util.Scanner;

public class Ej4TablaMultiplicar {

	public static void main(String[] args) {

		Scanner pedirNumero = new Scanner(System.in);

		int numero;

		System.out.println("Introduce un numero para ver su tabla de multiplicar: ");
		numero = pedirNumero.nextInt();

		System.out.println("");
		System.out.println("Tabla del " + numero);
		System.out.println("---------------------------");

		for (int i = 1; i <= 10; i++) {
			int multiplicar = numero * i;
			System.out.println(numero + " x " + i + " = " + multiplicar);
		}

		pedirNumero.close();
	}

}
