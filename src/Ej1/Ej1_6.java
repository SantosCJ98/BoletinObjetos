package Ej1;

import static teclado.Teclado.*;

public class Ej1_6 {

	public static void main(String[] args) {

		Personas persona1 = new Personas();

		System.out.println("Ingrese el sueldo:");

		persona1.setSueldo(readFloat());

		System.out.println("Sumar sueldo: " + persona1.sumarsueldo(persona1));

		System.out.println("Doblar sueldo: " + persona1.doblar_sueldo());

	}

}
