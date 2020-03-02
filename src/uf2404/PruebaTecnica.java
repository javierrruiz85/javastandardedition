package uf2404;

public class PruebaTecnica {

	public static void main(String[] args) {
		System.out.println("Prueba tecnica");

		System.out.println("Empezamos el bucle");
		for (int i = 0; i < 5; i++) {

			// System.out.println("Esta es la iteracion numero " + i);
			if (i == 0) {
				System.out.println("El " + i + " no es par ni impar");
			} else {
				if (i % 2 == 0) {
					System.out.println(i + " es par");
				} else {
					System.out.println(i + " es impar");
				}
			}

		} // for

		System.out.println("Terminamos el bucle");

	} // main

} // clase
