package com.ipartek.formacion.clases;

public class PaisesPruebas {

	public static void main(String[] args) {

		// declarar un Array con 2 paises inicializados
		Pais[] paises = new Pais[2];

		// crear dos objetos de tipo PAIS

		// españa con 120 casos
		Pais españa = new Pais();
		españa.setNombre("España");
		españa.setNumeroInfectados(120);
		paises[0] = españa;

		// francia con 300 casos
		Pais francia = new Pais();
		francia.setNombre("Francia");
		francia.setNumeroInfectados(300);
		paises[1] = francia;

		for (int i = 0; i < paises.length; i++) {

			Pais paisActual = paises[i];

			if (paisActual.isInfectado()) {
				System.out.println(paisActual.getNombre() + " tiene " + paisActual.getNumeroInfectados() + " casos");
			} else {
				System.out.println(paisActual.getNombre() + " de momento libra");
			}

		}

		// mostrar por consola los datos

	}

}
