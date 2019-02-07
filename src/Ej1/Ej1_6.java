package Ej1;

import static teclado.Teclado.*;

public class Ej1_6 {

	public static void main(String[] args) {

		Persona persona1 = new Persona();

		Persona persona2 = new Persona();

		System.out.println("Ingrese el sueldo de la persona 1:");

		persona1.setSueldo(readFloat());

		System.out.println("Ingrese el sueldo de la persona 2:");

		persona2.setSueldo(readFloat());

		persona1.sumarsueldo(persona2);

		System.out.printf("Resultado suma: %.2f", persona1.getSueldo());

		persona1.doblar_sueldo();

		persona2.doblar_sueldo();

		System.out.printf("\nSueldo 2 doblado: %.2f", persona2.getSueldo());

	}

}
