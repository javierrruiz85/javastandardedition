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

		// comprobar el mayor y el menor
		if (num1 > num2) {
			mayor = num1;
			menor = num2;
		} else {
			mayor = num2;
			menor = num1;
		}

		// mostrar los numeros en orden ascendente
		System.out.println("Numeros entre " + menor + " y " + mayor);
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i);
		}

		pedirNumero.close();

	}

}
