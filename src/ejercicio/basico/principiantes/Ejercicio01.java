package ejercicio.basico.principiantes;

public class Ejercicio01 {
	public static void main(String[] args) {
		int a = 8;
		int b = 3;
		int c = -5;

		int ejercicio1 = a + b + c;
		System.out.println("a + b + c = " + ejercicio1);

		int ejercicio2 = 2 * b + 3 * (a - c);
		System.out.println("2 x b + 3 x (a - c) = " + ejercicio2);
		System.out.println("2 * b + 3 * (a - c) = " + 2 * b + 3 * (a - c));
		System.out.println(2 * b + 3 * (a - c));

		int ejercicio3 = a / b;
		System.out.println("a / b = " + ejercicio3);

		int ejercicio4 = a % b;
		System.out.println("a % b = " + ejercicio4);

		int ejercicio5 = a / c;
		System.out.println("a / c = " + ejercicio5);

		int ejercicio6 = a % c;
		System.out.println("a % c = " + ejercicio6);

		int ejercicio7 = a * b / c;
		System.out.println("a * b / c = " + ejercicio7);

		System.out.println("a * b / c = " + a * b / c);
	}

}
