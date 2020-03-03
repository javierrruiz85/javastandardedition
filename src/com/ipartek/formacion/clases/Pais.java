package com.ipartek.formacion.clases;

public class Pais {

	// atributos
	private String nombre;
	private int numeroInfectados;

	// cuandos se contruye un pais su nombre es "" (vacio) y el numero de casos es 0
	public Pais() {
		super();
		this.nombre = "";
		this.numeroInfectados = 0;
	}

	// crear getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroInfectados() {
		return numeroInfectados;
	}

	public void setNumeroInfectados(int numeroInfectados) {
		this.numeroInfectados = numeroInfectados;
	}

	public boolean isInfectado() {

		return this.numeroInfectados > 0;
	}

	// crear toString
	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", numeroInfectados=" + numeroInfectados + "]";
	}

}
