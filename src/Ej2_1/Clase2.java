package Ej2_1;

public class Clase2 {

	public static void main(String[] args) {

		Visibilidad otraclasemismopaquete = new Visibilidad();

//		otraclasemismopaquete.privado = 0; Privado no es visible en otra clase en el mismo paquete

		otraclasemismopaquete.amigable = 0;

		otraclasemismopaquete.protegido = 0;

		otraclasemismopaquete.publico = 0;

		otraclasemismopaquete.met_publico();

		otraclasemismopaquete.met_amigable();

//		otraclasemismopaquete.met_privado();  Privado no es visible en otra clase en el mismo paquete

		otraclasemismopaquete.met_protegido();

	}

}
