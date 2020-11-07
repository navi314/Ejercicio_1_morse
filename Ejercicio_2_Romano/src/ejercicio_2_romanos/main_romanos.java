package ejercicio_2_romanos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class main_romanos {

	public static void main(String[] args) {
		int userInput;
		Romano convertir = new Romano();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		boolean ciclo = true;
		while(ciclo) {
			System.out.println(" ============================================ ");
			System.out.println(" Numeros Romanos");
			System.out.println(" Ingresa el numero a convertir (Este numero debera de estar en el rango del 1 al 1000)");
			System.out.println(" ============================================ ");

			try {
				userInput = Integer.parseInt( reader.readLine().toUpperCase() );
				if(userInput >= 1 && userInput <=1000) {
					System.out.println(" ============================================ ");
					System.out.println(" Resultado: "+convertir.intToRoman(userInput));
					System.out.println(" 1) Continuar");
					System.out.println(" 2) Salir");
					System.out.println(" ============================================ ");
					userInput = Integer.parseInt( reader.readLine().toUpperCase() );
					if(userInput == 2) {
						ciclo=false;
						System.out.println("El programa termino");
					}
				}else {
					System.out.println("El numero esta fuera del rango");
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch(NumberFormatException e) {
				System.out.println("Favor de ingresar numeros");
			}
		}
		
	}
}
