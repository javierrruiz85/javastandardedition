package com.ipartek.formacion.metodos;

public class Vueltas {

	public static final float[] BILLETES_MONEDAS = { 500f, 200f, 100f, 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };

	public static int[] calcularVueltasOptimas(float importe, float entregado) throws Exception {

		int[] vueltas = new int[BILLETES_MONEDAS.length];
		float cambios = 0f;

		for (int i = 0; i < vueltas.length; i++) {

			if (entregado >= vueltas[i]) {
				entregado = entregado - vueltas[i];
				vueltas[i] = 1;
			} else {
				vueltas[i] = 0;
			}
		}

		// TODO vuestro marron

		return vueltas;

	}

	public static float calcularVueltas(float importe, float entregado) throws Exception {

		float cambios = 0f;

		if (entregado >= importe) {
			cambios = entregado - importe;

		} else {
			throw new Exception("El dinero entregado no es suficiente");
		}

		return cambios;
	}

}
