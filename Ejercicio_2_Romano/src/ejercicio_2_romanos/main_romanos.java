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
			System.out.println(" Ingresa el numero a convertir");
			System.out.println(" ============================================ ");

			try {
				userInput = Integer.parseInt( reader.readLine().toUpperCase() );
				System.out.println("Resultado: "+convertir.intToRoman(userInput));
			} catch (IOException e) {
				e.printStackTrace();
			} catch(NumberFormatException e) {
				System.out.println("Favor de ingresar numeros");
			}
		}
		
	}
}
