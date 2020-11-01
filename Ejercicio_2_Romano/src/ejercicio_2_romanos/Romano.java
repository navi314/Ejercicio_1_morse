package ejercicio_2_romanos;

public class Romano {
	private int num[] = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
	private String sym[] = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };

	// Funcion para construir el numero en romano
	public String intToRoman(int number) {
		String res = "";
		int i = sym.length - 1;
		while (number > 0) {
			// Obtenemos el numero de veces que va a aparecer el simbolo en el numero
			int div = number / num[i];
			// Obtenemos el numero restante con el que se va a trabajar
			number = number % num[i];
			while (div > 0) {
				// Añadimos al resultado el simbolo del numero
				res += sym[i];
				div--;
			}
			i--;
		}
		return res;
	}
}
