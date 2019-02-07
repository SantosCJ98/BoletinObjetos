package Ej1;

import static teclado.Teclado.*;

public class Ej1_1 {

	public static void main(String[] args) {

		Persona persona1 = new Persona();

		System.out.println("Introduce un nombre:");

		persona1.setNombre(readString());

		System.out.println("Resultado: " + persona1.getNombre());

	}

}
