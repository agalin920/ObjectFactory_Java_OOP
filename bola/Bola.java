package bola;

public class Bola {
	
	String nombre;
	Color color;
	public static int contador;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Bola(String nombre, Color color) {
		super();
		this.nombre = nombre;
		this.color = color;
		contador++;
	}
	
	
	public Bola(){
		contador++;
	}

	@Override
	public String toString() {
		return "Bola [nombre=" + nombre + ", color=" + color + "]";
	}
	
	
	
	
	
}
