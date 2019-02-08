package Ej6;

import static teclado.Teclado.*;

public class Dimensiones {

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	private float x;

	private float y;

	private float z;

	Dimensiones() {

		this.x = 0;

		this.y = 0;

		this.z = 0;

	}

	Dimensiones(float x, float y, float z) {

		this.x = x;

		this.y = y;

		this.z = z;

	}

	float alturaMaximaparaApilar(float AlturaMaxima) {

		return AlturaMaxima - y;

	}

	float sumaDimensionesX(Dimensiones dimensiones) {

		return this.x + dimensiones.x;

	}

	float sumaDimensionesY(Dimensiones dimensiones) {

		return this.y + dimensiones.y;

	}

	float sumaDimensionesZ(Dimensiones dimensiones) {

		return this.z + dimensiones.z;

	}

	public String toString() {

		return "Dimensiones: x = " + x + "; y = " + y + "; z = " + z;

	}

	boolean esPosibleApilarPaquetes(Dimensiones dimensionesOtroPaquete, float alturaMaximaparaApilar) {

		if (dimensionesOtroPaquete.y <= alturaMaximaparaApilar) {

			return true;

		}

		else {

			return false;

		}

	}

	void girarDimensionX() {

		float aux = y;

		y = z;

		z = aux;

	}

	void girarDimensionY() {

		float aux = x;

		x = z;

		z = aux;

	}

	void girarDimensionZ() {

		float aux = x;

		x = y;

		y = aux;

	}

	String ApilarPaquetes(Dimensiones dimensionesOtroPaquete, float AlturaMaximaparaApilar) {

		int opcion = 0;

		while (opcion != 4
				&& (!esPosibleApilarPaquetes(dimensionesOtroPaquete, alturaMaximaparaApilar(AlturaMaximaparaApilar)))) {

			System.out.println("Altura maxima: " + AlturaMaximaparaApilar);

			System.out.println("Altura del paquete colocado (y): " + this.getY());

			System.out.println("Altura del paquete a colocar (y): " + dimensionesOtroPaquete.getY());

			System.out.println("No se puede apilar. Inténtalo girándola.");

			System.out.println(dimensionesOtroPaquete.toString());

			System.out.println(
					"1. Girar 90º (eje X)\n2. Girar 90º (eje Y)\n3. Girar 90º (eje Z)\n4. Dejar de intentarlo");

			opcion = readRange(1, 4, Rangos.AMBOSIN);

			switch (opcion) {

			case 1:
				dimensionesOtroPaquete.girarDimensionX();
				break;

			case 2:
				dimensionesOtroPaquete.girarDimensionY();
				break;

			case 3:
				dimensionesOtroPaquete.girarDimensionZ();
				break;

			}
		}

		if (esPosibleApilarPaquetes(dimensionesOtroPaquete, alturaMaximaparaApilar(AlturaMaximaparaApilar))) {

			return "Apilado";

		}

		else {

			return "No apilado";

		}

	}

	public static void main(String args[]) {

		Dimensiones di = new Dimensiones(1, 7, 2);

		Dimensiones di2 = new Dimensiones(4, 4, 2);

		System.out.println(di.ApilarPaquetes(di2, 10));

	}

}
