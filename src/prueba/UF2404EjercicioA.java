package prueba;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Realizar un programa en java que realice la siguiente función: Crear un array
 * de 5 notas que almacenara en formato double. Una vez creado dicho array se
 * rellenaran dichos elementos leyéndolo desde el teclado. Una vez creado el
 * contenido, se calculara la media de las notas así como se mostraran las notas
 * más altas y más bajas de dicho array.
 * 
 * @author Javier Ruiz
 *
 */

public class UF2404EjercicioA {

	public static void main(String[] args) {

		// declarar variables: arrayNotas, media, maxima, minima
		double[] arrayNotas = new double[5];
		double media = 0;
		double maxima = Double.MIN_VALUE;
		double minima = Double.MAX_VALUE;

		// abrir escaner
		Scanner escaner = new Scanner(System.in);

		// para mostrar solo un decimal
		DecimalFormat df = new DecimalFormat("#.0");

		System.out.println("Dame 5 notas para calcular la calificacion mas alta, la mas baja y la media de todas ellas.");

		// hacer un for con la lingitud del array
		for (int i = 0; i < arrayNotas.length; i++) {

			// preguntar por pantalla la nota
			System.out.println("Dame la nota: ");
			double nota = Double.parseDouble(escaner.nextLine());
			// guardar en el aray la nota
			arrayNotas[i] = nota;
			// sumar la nota en la variable media
			media = media + nota;

			// comprobar si es la nota maxima para guardarla en la variable "maxima"
			if (nota >= maxima) {
				maxima = nota;
			}

			// comprobar si es la nota minima para guardarla en la variable "minima"
			if (nota <= minima) {
				minima = nota;
			}

		} // end for

		System.out.println("La calificacion mas alta es un: " + df.format(maxima));
		System.out.println("La calificacion mas baja es un: " + df.format(minima));
		// usar la variable media para conseguir la media de las notas
		System.out.println("La nota media es un: " + df.format(media / 5));

		// cerrar escaner
		escaner.close();

	} // main

}
