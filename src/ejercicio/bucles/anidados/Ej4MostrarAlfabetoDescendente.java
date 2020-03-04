package ejercicio.bucles.anidados;

public class Ej4MostrarAlfabetoDescendente {

	public static void main(String[] args) {

		for (char X = 'Z'; X >= 'A'; X--) {
			for (char Y = X; Y >= 'A'; Y--) {
				System.out.print(Y);
			}
			System.out.println();
		}

	}

}
