package uf2404;

public class JugandoConStrings {

	public static void main(String[] args) {

		// ¿ Que valor tiene por defecto un String si no lo inicializamos ?
		String sinInicializar;

		String nombre = "  AaAnN 5 9     ... 5. 4  5  ";

		// longitud
		System.out.println("Longitud del nombre " + nombre.length());

		// numero vocales
		int numeroVocales = 0;
		int numeroMayusculas = 0;
		int numeroMinusculas = 0;
		int numeroConsonantes = 0;
		int contarEspacios = 0;
		int contarNumeros = 0;

		// TODO contar numeros y espacios en blanco

		char caracter;
		for (int i = 0; i < nombre.length(); i++) {

			caracter = nombre.charAt(i);
			System.out.println("En la posicion " + i + " tenemos caracter " + caracter);

			// contar mayusculas y minusculas
			if (Character.isLowerCase(caracter)) {
				numeroMinusculas++;
			}
			if (Character.isUpperCase(caracter)) {
				numeroMayusculas++;
			}

			// Contar (Vocales o Consonates) Si => es Letra

			if (Character.isLetter(caracter)) {

				caracter = Character.toLowerCase(caracter);
				switch (caracter) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					numeroVocales++;
					break;

				default:
					numeroConsonantes++;
					break;
				}// switch

			} // if isLetter

			else {
				if (Character.isWhitespace(caracter)) {
					contarEspacios++;
				}

				if (Character.isDigit(caracter)) {
					contarNumeros++;
				}

				/*
				 * else { contarNumeros++; }
				 */
			}

		} // for

		System.out.println(" ");
		System.out.println("Numero Mayusculas " + numeroMayusculas);
		System.out.println("Numero Minusculas " + numeroMinusculas);
		System.out.println("Numero Vocales " + numeroVocales);
		System.out.println("Numero Consonantes " + numeroConsonantes);
		System.out.println("Numero de espacios " + contarEspacios);
		System.out.println("Cantidad de numeros " + contarNumeros);
		System.out.println(" ");

		// numero de palabras

		String palabras = "hola mi nombre es Ander";
		String[] arrayPalabras = palabras.split(" ");

		System.out.println("Tenemos " + arrayPalabras.length + " palabras en la frase");

		String lineaCVS = "jose;froilan;16;35.000";
		// TODO mostrar nombre y apellido, la edad y el sueldo anual

		// buscar posicion de una letra concreta
		String buscarLetra = "Abracadrabra";
		System.out.println("La primera b esta en la poscion " + buscarLetra.indexOf('b'));
		System.out.println("La primera a esta en la poscion " + buscarLetra.indexOf('a'));
		System.out.println("¿Que pasa si no encuentra? " + buscarLetra.indexOf('z'));
		// TODO buscar primera 'd'
		System.out.println("La primera d esta en la posicion " + buscarLetra.indexOf('d'));
		// TODO buscar posicion ultima 'a'
		System.out.println("La ultima a esta en la posicion " + buscarLetra.lastIndexOf('a'));

		// limpiar espacios en blanco
		String datosIntroducidosUsuario = "    minombre       es Manolo    ";
		String limpiarEspacios = datosIntroducidosUsuario.trim();
		limpiarEspacios = limpiarEspacios.replace("  ", "");
		System.out.println(limpiarEspacios);

		// TODO cambiar numeros por letras y ademas pasar todo a MAYSUCULAS
		String textoCodificado = " h0l4 m1 n0mb3 3s m4n0l0 ";
		char controlLetra;

		for (int i = 0; i < textoCodificado.length(); i++) {

			controlLetra = textoCodificado.charAt(i);

			switch (controlLetra) {
			case '0':
				controlLetra = 'O';
				break;

			case '3':

				break;

			case '4':

				break;

			default:
				break;
			}
		}

		// TODO sumar todos los numeros de este String

		final char LETRADNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };

		String dni = "12345678";
		int numeroDni = Integer.parseInt(dni);

		int resto = numeroDni % 23;

		System.out.println("La letra del dni " + dni + " es " + LETRADNI[resto]);

		// TODO buscar por interenet como se calcula la letra

	}

}
