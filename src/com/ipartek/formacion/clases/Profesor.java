package com.ipartek.formacion.clases;

public class Profesor extends Personas {

	// sueldo
	// materia

	// Atributos ******************************************************
	private float sueldo;
	private String materia;

	// Constructores ******************************************************
	public Profesor() {
		super();
		this.sueldo = 0f;
		this.materia = "";
	}

	// Setters y Getters ******************************************************
	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	// toString ******************************************************
	@Override
	public String toString() {
		return "Profesor [sueldo=" + sueldo + ", materia=" + materia + "]";
	}

}
