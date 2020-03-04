package ejercicio.basico.estructura.iterativa;

import java.util.Scanner;

public class Ej9PedirNumerosParaOrdenar {

	public static void main(String[] args) {

		int num1;
		int num2;
		int mayor;
		int menor;

		Scanner pedirNumero = new Scanner(System.in);

		do {
			System.out.println("Dame un numero entero: ");
			num1 = pedirNumero.nextInt();
			System.out.println("Dame otro numero entero distinto al primero: ");
			num2 = pedirNumero.nextInt();

			if (num1 == num2) {
				System.out.println("Los numeros son iguales");
			}

		} while (num1 == num2);

		pedirNumero.close();

	}

}
