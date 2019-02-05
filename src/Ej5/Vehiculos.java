package Ej5;

import static teclado.Teclado.*;

import java.util.ArrayList;

public class Vehiculos {
	
	private String modelo;
	
	private double potencia;
	
	private boolean cRuedas;
	
	Vehiculos(String modelo) {
		
		this.modelo = modelo;
		
	}

	private String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	private double getPotencia() {
		return potencia;
	}

	private void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	private boolean iscRuedas() {
		return cRuedas;
	}

	private void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}

	public String toString() {
		
		String res = "Modelo = " + modelo + ", Potencia = " + potencia + ", ";
		
		if (cRuedas) {
			
			res = res + "Tracción 4 ruedas: Sí";
			
		}
		
		else {
			
			res = res + "Tracción 4 ruedas: No";
			
		}
		
		return res;
	}
	
	static void pedirVehiculos () {
		
		ArrayList <Vehiculos> lista = new ArrayList<>(); 
		
		int i = 0;
		
		String modelo ="";
		
		double potencia;
		
		boolean cRuedas;
		
		while (!(modelo.equals("FIN") || modelo.equals("fin"))) {
			
			System.out.println("Vehículo nº " + (i+1));
			
			System.out.println("Introduce el modelo");
			
			modelo = readString();
			
			System.out.println("Introduce la potencia");
			
			potencia = readDouble();
			
			cRuedas = readBoolean("¿Tracción a 4 ruedas");
			
			if (!modelo.equalsIgnoreCase("FIN")) {
				
				Vehiculos veh = new Vehiculos(modelo);
				
				veh.setPotencia(potencia);
				
				veh.setcRuedas(cRuedas);
				
				lista.add(i, veh);
				
				i++;
				
			}
				
		}	
		
		Vehiculos [] arrayveh = new Vehiculos [lista.size()];
		
		arrayveh = lista.toArray(arrayveh);
		
		for (i = 0; i < arrayveh.length; i++) {
			
			System.out.println("Vehículo nº " + (i+1));
			
			System.out.println(arrayveh[i].toString());
			
		}
		
		System.out.println("Hasta luego");
		
			
		}
		

	public static void main (String args[]) {
		
		pedirVehiculos();
		
	}
	

}
