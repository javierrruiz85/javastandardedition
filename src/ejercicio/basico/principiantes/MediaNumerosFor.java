package ejercicio.basico.principiantes;

/**
 * 
 * Pedir al usuario la temperatura de los dias de la semana, comenzando por el
 * lunes<br>
 * Mostrar por pantalla la media de la semana, y la temperatura mas alta y baja
 * 
 * 
 * 
 *
 */
public class MediaNumerosFor {

	public static void main(String[] args) {

		String[] diasSemana = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };

		for (int i = 0; i <= 6; i++) {
			String dia = diasSemana[i];
			System.out.println("Dime la tempeatura del " + dia);
		}

	}

}
