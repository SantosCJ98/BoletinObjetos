package Ej2_2;

import Ej2_1.Visibilidad;

public class Clase3 {

	public static void main(String[] args) {

		Visibilidad otraclaseotropaquete = new Visibilidad();

		// No visible otraclaseotropaquete.privado = 0;

		// No visible otraclaseotropaquete.amigable = 0;

		// No visible otraclaseotropaquete.protegido = 0;

		otraclaseotropaquete.publico = 0;

		otraclaseotropaquete.met_publico();

		// No visible otraclaseotropaquete.met_amigable();

		// No visible otraclaseotropaquete.met_privado();

		// No visible otraclaseotropaquete.met_protegido();

	}

}
