package Ej1;

import static teclado.Teclado.*;

public class Ej1_4 {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Santos", 20, 1.75f, "Informatico");

		System.out.printf("Resultado:\nNombre: %s\nEdad: %d\nAltura: %.2f\nOcupación: %s", persona1.getNombre(),
				persona1.getEdad(), persona1.getAltura(), persona1.getOcupacion());

	}

}
