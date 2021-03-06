package Ej1;

public class Personas {

	private String nombre;

	private int edad;

	private float altura;

	private String ocupacion;

	private float sueldo;

	String getNombre() {

		return nombre;

	}

	void setNombre(String nombre) {

		this.nombre = nombre;

	}

	// Ej1.2

	int getEdad() {

		return edad;

	}

	void setEdad(int edad) {

		this.edad = edad;

	}

	float getAltura() {

		return altura;

	}

	void setAltura(float altura) {

		this.altura = altura;

	}

	String getOcupacion() {

		return ocupacion;

	}

	void setOcupacion(String ocupacion) {

		this.ocupacion = ocupacion;

	}

	float getSueldo() {

		return sueldo;

	}

	void setSueldo(float sueldo) {

		this.sueldo = sueldo;

	}

	/*
	 * 1.3
	 * 
	 * public Personas() {
	 * 
	 * nombre = "Sin nombre";
	 * 
	 * edad = 0;
	 * 
	 * altura = 0.0f;
	 * 
	 * ocupacion = "Sin ocupación";
	 * 
	 * }
	 * 
	 */

	// 1.4

	public Personas(String nombre, int edad, float altura, String ocupacion) {

		this.nombre = nombre;

		this.edad = edad;

		this.altura = altura;

		this.ocupacion = ocupacion;

	}

	// 1.5

	public Personas() {

		this("Sin nombre", 0, 0.0f, "Sin ocupación");

	}

	// 1.6

	float sumarsueldo(Personas persona) {

		sueldo += persona.sueldo;

		return sueldo;

	}

	float doblar_sueldo() {

		sumarsueldo(this);

		return sueldo;

	}

}
