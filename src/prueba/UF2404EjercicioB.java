package prueba;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Crear un proyecto en modo consola que nos muestre un men� de 3 opciones
 * <ol>
 * <li>Calcular la letra del dni</li>
 * <li>Calcular medida de cm a pulgadas</li>
 * <li>Salir</li>
 * </ol>
 * Hacer que dicho men� se ejecute en bucle hasta que se pulse salir, y si el
 * usuario escoge cada una de las funciones, que permita introducir los datos
 * correspondientes por teclado para poder dar el resultado
 *
 * @author Javier Ruiz
 *
 */

public class UF2404EjercicioB {

	// abrir escaner
	static Scanner escaner;

	public static void main(String[] args) {

		int opcion = 0;
		escaner = new Scanner(System.in);
		boolean continuar = true;

		// do
		do {
			// pintar menu por pantalla
			System.out.println("****************************************");
			System.out.println("*                                      *");
			System.out.println("*  1. Calcular la letra del DNI        *");
			System.out.println("*  2. Pasar de centimetros a pulgadas  *");
			System.out.println("*  3. Salir                            *");
			System.out.println("*                                      *");
			System.out.println("*        Selecciona una opcion         *");
			System.out.println("*                                      *");
			System.out.println("****************************************");

			try {
				// pedir una opcion al usuario por pantalla
				opcion = Integer.parseInt(escaner.nextLine());

				// switch case
				switch (opcion) {
				case 1:
					calcularDNI();
					break;

				case 2:
					convertirMedidas();
					break;

				case 3:
					System.out.println(" ");
					System.out.println("Hasta luego");
					System.out.println(" ");
					continuar = false;
					break;

				default:
					System.out.println(" ");
					System.out.println("Por favor, selecciona una opcion valida");
					System.out.println(" ");
					break;
				}
			} catch (Exception e) {
				System.out.println(" ");
				System.out.println("Por favor, selecciona una opcion valida");
				System.out.println(" ");
			}

		} while (continuar); // while (continuar)

		// cerrar escaner
		escaner.close();

	} // main

	private static void calcularDNI() {

		// System.out.println("Calcular DNI");
		System.out.println(" ");
		System.out.println("Dame un numero de DNI para calcular su letra: ");

		escaner = new Scanner(System.in);

		int dni = 0;
		boolean bien = true;

		do {
			String dniPantalla = escaner.nextLine();

			if (dniPantalla.length() != 8) {
				System.out.println(" ");
				System.out.println("Por favor, introduce un DNI valido de 8 digitos");
				System.out.println(" ");
			}

			else {
				try {
					dni = Integer.parseInt(dniPantalla);
					final char LETRADNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

					System.out.println(" ");
					System.out.println("Al DNI " + dniPantalla + " le corresponde la letra " + LETRADNI[dni % 23]);
					System.out.println(" ");
					bien = false;
				} catch (Exception e) {
					System.out.println(" ");
					System.out.println("Por favor, introduce un DNI valido de 8 digitos");
					System.out.println(" ");
					// e.printStackTrace(); <==== esta linea muestra el mismo codigo de error que da
					// java por defecto
				}

			}
		} while (bien);

	}

	private static void convertirMedidas() {

		// para mostrar solo 2 decimales
		DecimalFormat decimales = new DecimalFormat("#.00");

		System.out.println(" ");
		System.out.println("Dame una medida en centimetros para calcularla en pulgadas: ");
		escaner = new Scanner(System.in);
		boolean control = true;

		do {
			try {
				String medidaPantalla = escaner.nextLine();
				double medida = Double.parseDouble(medidaPantalla);

				System.out.println(" ");
				System.out.println(medidaPantalla + " cm son " + decimales.format(medida / 2.54) + " pulgadas");
				System.out.println(" ");
				control = false;
			} catch (Exception e) {
				System.out.println(" ");
				System.out.println("Por favor, introduce una medida correcta");
				System.out.println(" ");
			}
		} while (control);

	}

}
