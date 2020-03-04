package ejercicios.arrays;

public class Ej4ArrayNumerosPares {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// int i;
		int contador = 2;

		int[] pares = new int[20];

		// Llenamos el array con números pares. Utilizamos un contador
		// con valor inicial 2 y le sumamos dos en cada iteración.
		for (int i = 0; i < pares.length; i++) {
			pares[i] = contador;
			contador = contador + 2;
		}

		// Mostrar el array
		for (int i = 0; i < pares.length; i++) {
			System.out.println(pares[i]);
		}

		System.out.println(pares[5]);

		int A = 15;

		System.out.println(A + (A % 2 == 0 ? "es par" : "es impar"));

		if (A % 2 == 0) {
			System.out.println("es par");
		} else {
			System.out.println("es impar");
		}

	}

}
