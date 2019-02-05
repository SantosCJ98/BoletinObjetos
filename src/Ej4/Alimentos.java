package Ej4;

import static teclado.Teclado.*;

public class Alimentos {

	private String nombre;

	private float lipidos;

	private float hidratoscarbono;
	
	private float proteinas;

	private boolean origenanimal;

	private Contenido vitaminas;

	private Contenido minerales;


	Alimentos(String nombre) {

		this.nombre = nombre;
		
		this.lipidos = 0;
		
		this.hidratoscarbono = 0;
		
		this.proteinas = 0;
		
		this.origenanimal = false;
		
		this.vitaminas = Contenido.BAJO;
		
		this.minerales = Contenido.BAJO;

	}

	Alimentos(String nombre, float lipidos, float hidratoscarbono, float proteinas, boolean origenanimal, Contenido vitaminas,
			Contenido minerales) {

		this.nombre = nombre;

		this.lipidos = lipidos;

		this.hidratoscarbono = hidratoscarbono;
		
		this.proteinas = proteinas;

		this.origenanimal = origenanimal;

		this.vitaminas = vitaminas;

		this.minerales = minerales;

	}

	static boolean esDietetico(float lipidos, Contenido vitaminas) {

		if (lipidos < 20 && vitaminas.getCodigo() != 'B') {

			return true;

		}

		else {

			return false;

		}

	}
	
	public String toString () {
		
		String res = "Nombre: " + nombre + "\n"
				+ "Lipidos: " + lipidos + "\n"
				+ "Hidratos de Carbono: " + hidratoscarbono + "\n" +
				"Proteínas: " + proteinas + "\n";
		
		
	if (origenanimal) {
		
		res = res + "Origen animal: Sí\n";
		
	}
	
	else {
		
		res = res + "Origen animal: No\n";
		
	}
	
	if (vitaminas.equals(Contenido.ALTO)) {
		
		res = res + "Vitaminas: Alto";
		
	}
	
	else if (vitaminas.equals(Contenido.MEDIO)) {
		
		res = res + "Vitaminas: Medio";
		
	}
	
	else {
		
		res = res + "Vitaminas: Bajo";
		
	}
	
	if (minerales.equals(Contenido.ALTO)) {
		
		res = res + "\nMinerales: Alto";
		
	}
	
	else if (minerales.equals(Contenido.MEDIO)) {
		
		res = res + "\nMinerales: Medio";
		
	}
	
	else {
		
		res = res + "\nMinerales: Bajo";
		
	}
	
		return res;
	}
	
	static float calculaContenidoEnergetico (float hidratoscarbono, float lipidos, float proteinas) {
		
		float energia = ((hidratoscarbono/100) * 4.1f) + ((lipidos/100) * 9.4f) + ((proteinas/100) * 5.3f);
		
		return energia;
		
	}
	
	static boolean  esRecomendableparaDeportistas (float hidratoscarbono, float proteinas, float lipidos) {
		
		if ((hidratoscarbono >= 55 && hidratoscarbono <= 65) && (proteinas >= 10 && proteinas <= 15) && (lipidos >= 30 && lipidos <= 35)) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}
	
	static void VerAlimento (Alimentos alimento) {
		
System.out.println(alimento.toString());
		
		System.out.println("Contenido Energético: " + calculaContenidoEnergetico(alimento.hidratoscarbono, alimento.lipidos, alimento.proteinas) + " Kcals.");
		
		if (esDietetico(alimento.lipidos, alimento.vitaminas)) {
			
			System.out.println("Diétetico");
			
		}
		
		else {
			
			System.out.println("No diétetico");
			
		}
		
		if (esRecomendableparaDeportistas(alimento.hidratoscarbono, alimento.proteinas, alimento.lipidos)) {
			
			System.out.println("Recomendable para deportistas");
			
		}
		
		else {
			
			System.out.println("No se recomienda a deportistas");
			
		}
		
		System.out.println("--------------------------------------------");
		
	}
	
	public static void main (String args[]) {
		
		Alimentos ali1 = new Alimentos("Pan");
		
		Alimentos ali2 = new Alimentos("Leche", 50, 20, 4, true, Contenido.ALTO, Contenido.MEDIO);
		
		//--------------------------------------------------------------------------------------------
		
		
		VerAlimento(ali1);
		
		VerAlimento(ali2);
		
	
	//-------------------------------------------------------------

}
	
}
