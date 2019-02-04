package Ej4;

import static teclado.Teclado.*;

public class Alimentos {

	private String nombre;

	private int lipidos;

	private int hidratoscarbono;
	
	private int proteinas;

	private boolean origenanimal;

	private Contenido vitaminas;

	private Contenido minerales;


	Alimentos(String nombre) {

		this.nombre = nombre;

	}

	Alimentos(String nombre, int lipidos, int hidratoscarbono, int proteinas, boolean origenanimal, Contenido vitaminas,
			Contenido minerales) {

		this.nombre = nombre;

		this.lipidos = lipidos;

		this.hidratoscarbono = hidratoscarbono;
		
		this.proteinas = proteinas;

		this.origenanimal = origenanimal;

		this.vitaminas = vitaminas;

		this.minerales = minerales;

	}

	boolean esDietetico(Alimentos alimento) {

		if (alimento.lipidos < 20 && alimento.vitaminas.getCodigo() != 'B') {

			return true;

		}

		else {

			return false;

		}

	}
	
	void toString (Alimentos alimento) {
		
		System.out.println("Nombre: " + nombre + "\n"
				+ "Lipidos: " + lipidos + "\n"
				+ "Hidratos de Carbono: " + hidratoscarbono + "\n" +
				"Proteínas: " + proteinas);
		
		if (origenanimal) {
			
			System.out.println("Origen Animal: Sí");
			
		}
		
		else {
			
			System.out.println("Origen Animal: No");
			
		}
		
		System.out.print("Vitaminas: ");
		
		if (vitaminas.getCodigo() == 'A') {
			
			System.out.println("Alto");
			
		}
		
		else if (vitaminas.getCodigo() == 'M') {
			
			System.out.println("Medio");
			
		}
		
		else {
			
			System.out.println("Bajo");
			
		}
		
		System.out.print("Minerales: ");
		
		if (minerales.getCodigo() == 'A') {
			
			System.out.println("Alto");
			
		}
		
		else if (minerales.getCodigo() == 'M') {
			
			System.out.println("Medio");
			
		}
		
		else {
			
			System.out.println("Bajo");
			
		}
	}
	
	static float calculaContenidoEnergético (Alimentos alimento) {
		
		float energia = (alimento.hidratoscarbono * 4.1f) + (alimento.lipidos * 9.4f) + (alimento.proteinas * 5.3f);
		
		return energia;
		
	}
	
	static boolean  esRecomendableparaDeportistas (Alimentos alimento) {
		
		if ((alimento.hidratoscarbono >= 55 && alimento.hidratoscarbono <= 65) && (alimento.proteinas >= 10 && alimento.proteinas <= 15) && (alimento.lipidos >= 30 && alimento.lipidos <= 35)) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}
	
	public static void main (String args[]) {
		
		Alimentos ali1 = new Alimentos("Alimento2", 30, 20, 50, true, Contenido.ALTO, Contenido.BAJO);
		
		ali1.toString(ali1);
		
		System.out.println("Contenido energético: " + calculaContenidoEnergético(ali1) + " Kcals");
		
		if (ali1.esDietetico(ali1)) {
			
			System.out.println("Es diétetico");
			
		}
		
		else {
			
			System.out.println("No es diétetico");
			
		}
		
		if (ali1.esRecomendableparaDeportistas(ali1)) {
			
			System.out.println("Es recomendable para deportistas");
			
		}
		
		else {
			
			System.out.println("No es recomendable para deportistas");
			
		}
		
		
	}

}
