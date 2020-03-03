package com.ipartek.formacion.clases;

public class Persona {

	// atributos
	// siempre son 'private' para que no se puedan manipular desde fuera de esta
	// clase
	// para poder manipular los atributos hay que crear metodos 'publicos'
	// denominados getters y setters
	// a esto se le llama encapsulacion
	private String nombre;
	private int edad;

	// constructor porque se llama igual que la clase
	public Persona() {
		super();
		this.nombre = "Anonimo";
		this.edad = 18;
	}

	// getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {

		if (edad < 0) {
			this.edad = 0;
		} else {
			this.edad = edad;
		}

		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
