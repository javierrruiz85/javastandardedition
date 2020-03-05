package prueba;

import java.util.Scanner;

/**
 * 
 * crear proyecto en modo consola, un menu con 3 opciones calcular la letra del
 * dni calcular medida de grados a farenheit salir del menu
 *
 *
 * BUCLES
 *
 * FOR: hacer cuando haya una coleccion de datos, WHILE: intentar evitar, DO
 * WHILE: usar cuando se tenga que ejecutar la repeticion al menos una vez
 *
 *
 * @author Curso
 *
 */

public class EjercicioB {

	static Scanner sc;

	public static void main(String[] args) {

		int opcion = 0;
		sc = new Scanner(System.in);
		boolean continuar = true;

		do {
			System.out.println("*************************************************");
			System.out.println("*                                               *");
			System.out.println("*  1. Calcular la letra del DNI                 *");
			System.out.println("*  2. Pasar de grados centigrados a fahrenheit  *");
			System.out.println("*  3. Salir                                     *");
			System.out.println("*                                               *");
			System.out.println("*            Selecciona una opcion              *");
			System.out.println("*                                               *");
			System.out.println("*************************************************");
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {

			case 1:
				calcularDNI();
				break;

			case 2:
				convertirTemperatura();
				break;

			case 3:
				System.out.println(" ");
				System.out.println("Tanta gloria lleves como descanso dejas");
				System.out.println(" ");
				continuar = false;
				break;

			default:
				System.out.println(" ");
				System.out.println("Por favor selecciona una opcion valida");
				System.out.println(" ");
				break;
			} // switch

		} while (continuar);

		sc.close();

	} // main

	private static void convertirTemperatura() {
		// formula ºF = (ºC x 1,8) + 32

		System.out.println("Dame la temperatura en grados celsius para verla en fahrenheit: ");
		sc = new Scanner(System.in);
		String celsiusPantalla = sc.nextLine();
		int gradosCelsius = Integer.parseInt(celsiusPantalla);

		System.out.println(" ");
		System.out.println(celsiusPantalla + " ºC son " + ((gradosCelsius * 1.8) + 32) + " ºF");
		System.out.println(" ");

	} // convertir de ºC a ºF

	private static void calcularDNI() {

		System.out.println("Dame tu DNI para calcular la letra: ");
		sc = new Scanner(System.in);
		String leidoPorPantalla = sc.nextLine(); // leemos el dni del usuario (siempre con un nextLine, de lo contrario
													// no funciona)
		int dni = Integer.parseInt(leidoPorPantalla); // parseamos el dato leido, de un string a un int para que el
														// programa puede usarlo

		final char LETRADNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };

		int resto = dni % 23;

		System.out.println(" ");
		System.out.println("La letra del dni " + dni + " es la " + LETRADNI[resto]);
		System.out.println(" ");

	} // calcular dni

}
