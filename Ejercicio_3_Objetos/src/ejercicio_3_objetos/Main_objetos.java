package ejercicio_3_objetos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_objetos {

	public static void main(String[] args) {

		boolean ciclo = true;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		do {
			int lado = 0;

			System.out.println(" ========================================================== ");
			System.out.println(" Menú principal");
			System.out.println(" Introducir la longitud de uno de los lados de la figura");
			System.out.println(" ========================================================== ");

			// Se lee la opcion que selecciono el usuario
			try {
				lado = Integer.parseInt(reader.readLine());
				ciclo = menuCalculo(lado);
			} catch (NumberFormatException e1) {
				System.out.println("Favor de introducir un numero");
			} catch (IOException e1) {
				System.out.println("Erro en la lactura del valor. El programa se termino.");
				return;
			}
		} while (ciclo);
	}

	public static boolean menuCalculo(int lado) {
		Cubo cubo = new Cubo(lado);
		Cuadrado cuadrado = new Cuadrado(lado);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean menu_calculo = true;
		do {
			int opcion = 0;

			System.out.println(" ========================================================== ");
			System.out.println(" Menú Calculo");
			System.out.println(" 1) Calcular el Area de un Cuadrado");
			System.out.println(" 2) Calcular el Perimetro de un Cuadrado");
			System.out.println(" 3) Calcular el Volumen de un Cubo");
			System.out.println(" 4) Calcular el Perimetro de un Cubo");
			System.out.println(" 5) Regresar al menú principal");
			System.out.println(" 6) Salir del programa");
			System.out.println(" ========================================================== ");

			// Se lee la opcion que selecciono el usuario
			try {
				opcion = Integer.parseInt(reader.readLine());
			} catch (IOException e1) {
				System.out.println("Erro en la lactura del valor. El programa se termino.");
				return false;
			}
			switch (opcion) {
			case 1:
				System.out.println("El área del cuadrado es: " + cuadrado.calcularArea());
				menu_calculo = menuResultado(lado);
				break;
			case 2:
				System.out.println("El perímetro del cuadrado es: " + cuadrado.calcularPerimetro());
				menu_calculo = menuResultado(lado);
				break;
			case 3:
				System.out.println("El volumen del cubo es: " + cubo.calcularVolumen());
				// Usamos la función del getter para obtener el lado del cubo
				menu_calculo = menuResultado(cubo.getLado());
				break;
			case 4:
				System.out.println("El perímetro del cubo es: " + cubo.calcularPerimetro());
				// Usamos el valor del lado que se manda a la función. 
				// Para el caso 3 y el caso 4 estamos mandando el mismo valor solo que lo obtenemos de forma diferente
				menu_calculo = menuResultado(lado);
				break;
			case 5:
				menu_calculo = false;
				break;
			case 6:
				System.out.println("El programa se termino");
				return false;
			default:
				System.out.println("Favor de seleccionar una de las opciones del menú");
			}

		} while (menu_calculo);
		return true;
	}

	public static boolean menuResultado(int lado) {
		boolean menu_resultado = true;
		boolean regreso = false;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		do {
			int opcion = 0;
			System.out.println(" ========================================================== ");
			System.out.println(" Menú de Resultados");
			System.out.println(" 1) Regresar al menú de calculos (Valor actual: "+ lado + ")");
			System.out.println(" 2) Regresar al menú inicial (Volver a ingresar el valor del lado)");
			System.out.println(" ========================================================== ");
			// Se lee la opcion que selecciono el usuario
			try {
				opcion = Integer.parseInt(reader.readLine());
			} catch (IOException e1) {
				System.out.println("Erro en la lactura del valor. El programa se termino.");
				return false;
			}	
			switch (opcion) {
			case 1:
				menu_resultado = false;
				regreso = true;
				break;
			case 2:
				menu_resultado = false;
				regreso = false;
				break;
				default:
					System.out.println("Favor de introduccir una opción valida");
			}
			
		} while (menu_resultado);
		return regreso;
	}
}
