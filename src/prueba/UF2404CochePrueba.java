package prueba;

import java.util.Scanner;

/**
 * Realizar un programa que nos cree una lista de coches, para ello deberá
 * almacenarse dentro de esta lista los objetos de tipo coche que crearemos. La
 * clase coche tendrá los siguientes atributos:
 * <ol>
 * <li>matricula</li>
 * <li>marca</li>
 * <li>modelo</li>
 * <li>color</li>
 * <li>potencia</li>
 * <li>cilindrada</li>
 * </ol>
 * 
 * Para rellenar la lista se creara un menú que nos solicitara introducir los
 * datos por teclado, y una vez leídos todos, se guardaran en un objeto que se
 * añadirá a la lista y nos pedirá que indiquemos si queremos introducir un
 * vehículo más o no.
 * 
 * Una vez que no queramos introducir más coches, nos mostrara todo el contenido
 * en pantalla
 * 
 * Realizar el ejercicio en base a las reglas de programación orientada a
 * objetos
 * 
 * @author Javier Ruiz
 *
 */

public class UF2404CochePrueba {

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);

		String matricula = "";
		String marca = "";
		String modelo = "";
		String color = "";
		float potencia = 0f;
		float cilindrada = 0f;
		String potenciaTeclado = "";
		String cilindradaTeclado = "";

		String masCoches = "";
		boolean continuar = true;
		int contador = 0;

		UF2404Coche[] arrayCoches = new UF2404Coche[5];

		System.out.println("Vamos a guardar los datos de tu coche: ");
		System.out.println(" ");

		do {

			System.out.println("Dame la matricula: ");
			matricula = escaner.nextLine();
			System.out.println("Dame la marca: ");
			marca = escaner.nextLine();
			System.out.println("Dame el modelo: ");
			modelo = escaner.nextLine();
			System.out.println("Dame el color: ");
			color = escaner.nextLine();
			System.out.println("Dame la potencia: ");
			potenciaTeclado = escaner.nextLine();
			potencia = Float.parseFloat(potenciaTeclado);
			System.out.println("Dame la cilindrada: ");
			cilindradaTeclado = escaner.nextLine();
			cilindrada = Float.parseFloat(cilindradaTeclado);

			UF2404Coche coche = new UF2404Coche();
			coche.setMatricula(matricula);
			coche.setMarca(marca);
			coche.setModelo(modelo);
			coche.setColor(color);
			coche.setPotencia(potencia);
			coche.setCilindrada(cilindrada);

			arrayCoches[contador] = coche;
			contador++;

			if (contador <= (arrayCoches.length - 1)) {
				System.out.println(" ");
				System.out.println("¿Quieres crear mas coches? Escribe 'si' para si o 'no' para no: ");
				System.out.println(" ");
				masCoches = escaner.nextLine();

				if ("no".equals(masCoches)) {
					continuar = false;
				}

			}

		} while (continuar && contador <= (arrayCoches.length - 1));

		for (int i = 0; i < arrayCoches.length; i++) {
			System.out.println(" ");
			System.out.println(arrayCoches[i]);
		}

		escaner.close();

		// numeroCoches = numeroCoches + 1;

		// Creamos el primer coche y le asignamos los valores pedidos arriba

//		arrayCoches[j] = coche1;
//		j++;

		// System.out.println(coche1.toString());

		// Preguntamos si quiere crear mas coches y en caso afirmativo solicitamos los
		// datos, creamos el coche y los asignamos
//		System.out.println(" ");
//		System.out.println("¿Quieres crear mas coches? Escribe 's' para si o 'n' para no: ");
//		System.out.println(" ");
		// masCoches = escaner.nextLine().charAt(0);

//		if (masCoches == 's') {
//			System.out.println("Dame la matricula: ");
//			matricula = escaner.nextLine();
//			System.out.println("Dame la marca: ");
//			marca = escaner.nextLine();
//			System.out.println("Dame el modelo: ");
//			modelo = escaner.nextLine();
//			System.out.println("Dame el color: ");
//			color = escaner.nextLine();
//			System.out.println("Dame la potencia: ");
//			potenciaTeclado = escaner.nextLine();
//			potencia = Float.parseFloat(potenciaTeclado);
//			System.out.println("Dame la cilindrada: ");
//			cilindradaTeclado = escaner.nextLine();
//			cilindrada = Float.parseFloat(cilindradaTeclado);
//
//			arrayCoches[i] = coche1;
//
//		}

	}

}
