package Ej1;

import static teclado.Teclado.*;

public class Ej1_3y5 {

	public static void main(String[] args) {

		Persona pordefecto = new Persona();

		System.out.printf("Valores por defecto:\nNombre: %s\nEdad: %d\nAltura: %.2f\nOcupación: %s",
				pordefecto.getNombre(), pordefecto.getEdad(), pordefecto.getAltura(), pordefecto.getOcupacion());

	}

}
