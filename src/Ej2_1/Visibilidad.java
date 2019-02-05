package Ej2_1;

public class Visibilidad {

	private int privado;

	int amigable;

	protected int protegido;

	public int publico;

	private void met_privado() {

	}

	void met_amigable() {

	}

	protected void met_protegido() {

	}

	public void met_publico() {

	}

	public static void main(String[] args) {

		Visibilidad mismaclase = new Visibilidad();

		mismaclase.privado = 0;

		mismaclase.amigable = 0;

		mismaclase.protegido = 0;

		mismaclase.publico = 0;

		mismaclase.met_publico();

		mismaclase.met_amigable();

		mismaclase.met_privado();

		mismaclase.met_protegido();
	}

}
