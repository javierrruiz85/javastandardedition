package com.ipartek.formacion.clases;

public class Alumno extends Personas {

	// email
	// github
	// nota

	// Atributos ******************************************************
	private String email;
	private String github;
	private float nota;

	// Constructores ******************************************************
	public Alumno() {
		super();
		this.email = "";
		this.github = "";
		this.nota = 0;
	}

	// Setters y Getters ******************************************************
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	// toString ******************************************************
	@Override
	public String toString() {
		return "Alumno [email=" + email + ", github=" + github + ", nota=" + nota + "]";
	}

}
