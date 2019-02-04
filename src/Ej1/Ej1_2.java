package Ej1;

import static teclado.Teclado.*;

public class Ej1_2 {

	public static void main(String[] args) {

		Personas persona1 = new Personas();

		System.out.println("Introduce un nombre:");

		persona1.setNombre(readString());

		System.out.println("Introduce una edad:");

		persona1.setEdad(readInt());

		System.out.println("Introduce una altura:");

		persona1.setAltura(readFloat());

		System.out.println("Introduce una ocupacion:");

		persona1.setOcupacion(readString());

		System.out.printf("Resultado:\nNombre: %s\nEdad: %d\nAltura: %.2f\nOcupación: %s", persona1.getNombre(),
				persona1.getEdad(), persona1.getAltura(), persona1.getOcupacion());

	}

}
