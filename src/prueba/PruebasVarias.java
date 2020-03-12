package prueba;

public class PruebasVarias {

	public static void main(String[] args) {
		final float BILLETES_MONEDAS[] = { 500f, 200f, 100f, 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };

		// String week[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes",
		// "Sabado", "Domingo" };

		// public static int[] calcularVueltasOptimas(float importe, float entregado)
		// throws Exception {

		int[] vueltas = new int[BILLETES_MONEDAS.length];
		float cambios = 0f;
		float importe = 253f;
		float entregado = 500f;

		cambios = entregado - importe;
		System.out.println("Cambios iniciales: " + cambios);

		for (int i = 0; i < vueltas.length; i++) {

			if (cambios >= BILLETES_MONEDAS[i]) {
				cambios = cambios - BILLETES_MONEDAS[i];
//				System.out.println("Billetes y monedas: " + BILLETES_MONEDAS[i]);
//				System.out.println("Importe: " + importe);
//				System.out.println("Entregado: " + entregado);
//				System.out.println("Vueltas: " + vueltas[i]);
//				System.out.println(entregado = entregado - vueltas[i]);
				vueltas[i] = 1;
			} else {
				vueltas[i] = 0;
			}

		}

		System.out.println("Importe: " + importe);
		System.out.println("Entregado: " + entregado);
		System.out.println("Cambios finales: " + cambios);

		for (int i = 0; i < vueltas.length; i++) {
			System.out.println("Valor: " + BILLETES_MONEDAS[i] + " € => Cantidad de billetes y monedas devuelta: " + vueltas[i]);
		}

		// TODO vuestro marron

		// }

	}

}
