package com.ipartek.formacion.clases;

public class Coche extends Vehiculo {

	private boolean radio;

	public Coche() {
		super();
		// this.numeroRuedas = 5; cambiar a 'Protected' para que sea visible
		setNumeroPuertas(5);
		setNumeroRuedas(4);
		this.radio = false;
	}

	// cuando es un booleano, el 'get' se convierte en un 'is'
	public boolean isRadio() {
		return radio;
	}

	public void setRadio(boolean radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return super.toString() + "Coche [radio=" + radio + "]";
	}

}
