package ejercicio_3_objetos;

public class Cubo extends Cuadrado{

	public Cubo(int lado) {
		super(lado);
	}

	// Calculamos el columen con 
	public double calcularVolumen() {
		return Math.pow(lado,3);
	}
	
	// Sobreescribimos la funcion de calcularPerimetro que se obtiene de la clase Cuadrado
	@Override
	public double calcularPerimetro() {
		return 6 * Math.pow(lado,2);
	}
}
