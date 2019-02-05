package Ej4;

public enum Contenido {

	ALTO('A'), MEDIO('M'), BAJO('B');

	private char codigo;

	Contenido(char codigo) {

		this.codigo = codigo;

	}

	char getCodigo() {

		return codigo;

	}

}
