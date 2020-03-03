package com.ipartek.formacion.clases;

public class ArrayPaises {

	private String nombre;
	// private boolean infectados;
	private int numCasos;

	public ArrayPaises() {
		super();
		this.nombre = "";
		this.numCasos = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumCasos() {
		return numCasos;
	}

	public void setNumCasos(int numCasos) {
		this.numCasos = numCasos;
	}

	@Override
	public String toString() {
		return "ArrayPaises [nombre=" + nombre + ", numCasos=" + numCasos + "]";
	}

}
