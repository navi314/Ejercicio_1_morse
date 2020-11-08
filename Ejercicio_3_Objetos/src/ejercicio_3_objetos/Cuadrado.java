package ejercicio_3_objetos;

public class Cuadrado {
	public int lado;
	
	public Cuadrado(int lado) {
		this.lado = lado;
	}
	
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public int getLado() {
		return this.lado;
	}
	
	public double calcularArea() {
		return Math.pow(lado,2);
	}
	
	public double calcularPerimetro() {
		return lado * 4;
	}
}
