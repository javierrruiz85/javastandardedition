package ejercicio.basico.principiantes;

import java.util.Scanner;

public class PaisesCoronaVirus {

	public static void main(String[] args) {

		final String[] PAISES = { "Noruega", "Alemania", "Republica Checa", "Italia" };
		boolean[] paisesInfectados = { false, false, false, false };
		int[] numeroInfectados = { 0, 0, 0, 0, };

		int totalInfectados = 0;

		// Recorrer paises y preguntar si existe algun caso de coronavirus
		// en caso afirmativo preguntar numero de infectados

		// Finalmente:
		// 1. mostrar paises libres de coronavirus
		// 2. mostrar paises infectados con su numero de casos
		// 3. total numero de personas infectadas

		for (int i = 0; i <= 3; i++) {
			String pais = PAISES[i];
			System.out.println("¿Hay infectados en " + pais + "?: ");

			Scanner teclado = new Scanner(System.in);
			String nombre = teclado.nextLine();

			if (paisesInfectados[i] = true) {
				System.out.println("Cuantos infectados hay: ");
				int cantidad = teclado.nextInt();
				totalInfectados = totalInfectados + cantidad;
			}

		}

	}

}
