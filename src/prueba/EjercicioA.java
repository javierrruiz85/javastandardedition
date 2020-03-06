package prueba;

import java.util.Scanner;

/**
 *
 * array con 5 alturas de personas (float, double o int). el array se rellena
 * pidiendo los datos por teclado. una vez rellenado, calcular la altura media,
 * la mas alta y la mas baja
 * 
 * @author Curso
 *
 */

public class EjercicioA {

	public static void main(String[] args) {

		float[] alturas = new float[5];
		float total = 0;
		float mayor = Float.MIN_VALUE;
		float menor = Float.MAX_VALUE;

		Scanner escaner = new Scanner(System.in);

		for (int i = 0; i < alturas.length; i++) {
			System.out.println("Dame una altura: ");
			float altura = Float.parseFloat(escaner.nextLine());
			alturas[i] = altura;
			total = total + alturas[i];

			// TODO revisar esta mierda que no rula

			if (altura >= mayor) {
				mayor = altura;
			}

			if (altura <= menor) {
				menor = altura;
			}

			// System.out.println("mayor = " + mayor);
			// System.out.println("menor = " + menor);
		}

		System.out.println("La altura media es de : " + total / 5 + " cm");
		System.out.println("La altura mayor es " + mayor + " cm");
		System.out.println("La altura menor es " + menor + " cm");

		escaner.close();

	}

}
