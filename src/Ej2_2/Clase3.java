package Ej2_2;

import Ej2_1.Visibilidad;

public class Clase3 {

	public static void main(String[] args) {
	
		Visibilidad otraclaseotropaquete = new Visibilidad();
		
		otraclaseotropaquete.privado = 0;
		
		otraclaseotropaquete.amigable = 0;

		otraclaseotropaquete.protegido = 0;
		
		otraclaseotropaquete.publico = 0;
		
		otraclaseotropaquete.met_publico();
		
		otraclaseotropaquete.met_amigable();
		
		otraclaseotropaquete.met_privado();
		
		otraclaseotropaquete.met_protegido();

	}

}
