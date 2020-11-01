package ejercicio_3_objetos;

public class Cubo extends Cuadrado{
	// Calculamos el columen con 
	public double calcularVolumen(int lado) {
		return Math.pow(lado,3);
	}
	
	// Sobreescribimos la funcion de calcularPerimetro que se obtiene de la clase Cuadrado
	@Override
	public double calcularPerimetro(int lado) {
		return 6 * Math.pow(lado,2);
	}
}
