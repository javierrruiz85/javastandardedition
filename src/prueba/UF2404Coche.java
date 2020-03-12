package prueba;

/**
 * Realizar un programa que nos cree una lista de coches, para ello deberá
 * almacenarse dentro de esta lista los objetos de tipo coche que crearemos. La
 * clase coche tendrá los siguientes atributos:
 * <ol>
 * <li>matricula</li>
 * <li>marca</li>
 * <li>modelo</li>
 * <li>color</li>
 * <li>potencia</li>
 * <li>cilindrada</li>
 * </ol>
 * 
 * Para rellenar la lista se creara un menú que nos solicitara introducir los
 * datos por teclado, y una vez leídos todos, se guardaran en un objeto que se
 * añadirá a la lista y nos pedirá que indiquemos si queremos introducir un
 * vehículo más o no.
 * 
 * Una vez que no queramos introducir más coches, nos mostrara todo el contenido
 * en pantalla
 * 
 * Realizar el ejercicio en base a las reglas de programación orientada a
 * objetos
 * 
 * @author Javier Ruiz
 *
 */

public class UF2404Coche {

	// Atributos
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private float potencia;
	private float cilindrada;

	// Constructores
	public UF2404Coche() {
		super();
		this.matricula = "";
		this.marca = "";
		this.modelo = "";
		this.color = "";
		this.potencia = 0f;
		this.cilindrada = 0f;
	}

	// Setters y Getters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}

	// toString
	@Override
	public String toString() {
		return "UF2404EjercicioPractico2Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", potencia=" + potencia + ", cilindrada=" + cilindrada + "]";
	}
}
