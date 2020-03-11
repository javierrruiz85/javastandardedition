package com.ipartek.formacion.clases;

public class Personas {

	// nombre
	// altura
	// edad
	// genero
	// raza

	// Atributos ******************************************************
	private String nombre;
	private float altura;
	private int edad;
	private String genero;
	private String raza;

	// Constructores ******************************************************
	public Personas() {
		super();
		this.nombre = "";
		this.altura = 0f;
		this.edad = 0;
		this.genero = "";
		this.raza = "";
	}

	// Setters y Getters ******************************************************
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	// toString ******************************************************
	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", genero=" + genero + ", raza=" + raza + "]";
	}

}
