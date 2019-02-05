package Ej3;

import static teclado.Teclado.*;

public class Alumno {

	private int matricula;

	private String nombre;

	private double nota1;

	private double nota2;

	private double getNota1() {
		return nota1;
	}

	private void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	private double getNota2() {
		return nota2;
	}

	private void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	Alumno(int matricula, String nombre) {

		this.matricula = matricula;

		this.nombre = nombre;

	}

	void ponNota(double nota1, double nota2) {

		this.nota1 = nota1;

		this.nota2 = nota2;

	}

	double dameMedia(double nota1, double nota2) {

		return (nota1 + nota2) / 2;

	}

	public String toString() {

		return "Nombre: " + nombre + "\n" +

				"Matrícula: " + matricula + "\n" +

				"Notas: " + nota1 + ", " + nota2 + "\n" +

				"Media: " + dameMedia(nota1, nota2);

	}

	static void VerAlumno() {

		int matricula;

		String nombre;

		double nota1, nota2;

		System.out.println("Inserta la matrícula:");

		matricula = readInt();

		System.out.println("Inserta el nombre:");

		nombre = readString();

		System.out.println("Inserta una nota:");

		nota1 = readDouble();

		System.out.println("Inserta otra nota:");

		nota2 = readDouble();

		Alumno alumno = new Alumno(matricula, nombre);

		alumno.setNota1(nota1);

		alumno.setNota2(nota2);

		System.out.println(alumno.toString());

	}

	public static void main(String args[]) {

		VerAlumno();

	}

}
