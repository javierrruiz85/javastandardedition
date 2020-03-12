package prueba;

import java.util.Scanner;

/**
 * Realizar un programa que nos cree una lista de coches, para ello deber�
 * almacenarse dentro de esta lista los objetos de tipo coche que crearemos. La
 * clase coche tendr� los siguientes atributos:
 * <ol>
 * <li>matricula</li>
 * <li>marca</li>
 * <li>modelo</li>
 * <li>color</li>
 * <li>potencia</li>
 * <li>cilindrada</li>
 * </ol>
 * 
 * Para rellenar la lista se creara un men� que nos solicitara introducir los
 * datos por teclado, y una vez le�dos todos, se guardaran en un objeto que se
 * a�adir� a la lista y nos pedir� que indiquemos si queremos introducir un
 * veh�culo m�s o no.
 * 
 * Una vez que no queramos introducir m�s coches, nos mostrara todo el contenido
 * en pantalla
 * 
 * Realizar el ejercicio en base a las reglas de programaci�n orientada a
 * objetos
 * 
 * @author Javier Ruiz
 *
 */

public class UF2404CochePrueba {

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);

		// Inicializamos variables
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

		// Creamos el array
		UF2404Coche[] arrayCoches = new UF2404Coche[5];

		System.out.println("Vamos a guardar los datos de tu coche: ");
		System.out.println(" ");

		// Rellenamos el array y vamos preguntando si introducimos mas coches
		do {

			// Pedimos por pantalla las especificaciones
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

			// Creamos el objeto coche y le asignamos los valores que hemos pedido antes
			UF2404Coche coche = new UF2404Coche();
			coche.setMatricula(matricula);
			coche.setMarca(marca);
			coche.setModelo(modelo);
			coche.setColor(color);
			coche.setPotencia(potencia);
			coche.setCilindrada(cilindrada);

			// Guardamos el coche creado en el array
			arrayCoches[contador] = coche;
			contador++;

			// Preguntamos si se van a crear mas coches
			if (contador <= (arrayCoches.length - 1)) {
				System.out.println(" ");
				System.out.println("�Quieres crear mas coches? Escribe 'si' para si o 'no' para no: ");
				System.out.println(" ");
				masCoches = escaner.nextLine();

				if ("no".equals(masCoches)) {
					continuar = false;
				}

			}

		} while (continuar && contador <= (arrayCoches.length - 1));

		// Mostramos por pantalla el array completo
		for (int i = 0; i < arrayCoches.length; i++) {
			System.out.println(" ");
			System.out.println(arrayCoches[i]);
		}

		escaner.close();

	}

}
