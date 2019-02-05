package Ej6;

public class Dimensiones {
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	private float x;
	
	private float y;
	
	private float z;
	
	Dimensiones() {
		
		this.x = 0;
		
		this.y = 0;
		
		this.z = 0;
		
	}
	
	Dimensiones(float x, float y, float z) {
		
		this.x = x;
		
		this.y = y;
		
		this.z = z;
		
	}
	
	float alturaMaximaparaApilar (float AlturaMaxima) {
		
		return AlturaMaxima - y;
		
	}
	
	float sumaDimensionesX(Dimensiones dimensiones) {
		
		return dimensiones.x += dimensiones.x;
		
		
		
		
		
	}

}
