package ejercicio_1_morse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Morse {

	public static void main(String args[])
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		boolean ciclo = true;
		Morse_code code = new Morse_code();
		do {
			String textoEntrada="";
			int opcion = 0;

			System.out.println(" ============================================ ");
			System.out.println(" Selecciona una opción del menú");
			System.out.println(" 1) Generar codigo morse");
			System.out.println(" 2) Descifrar codigo morse");
			System.out.println(" 3) Presiona otra tecla para salir");
			System.out.println(" ============================================ ");

			// Se lee la opcion que selecciono el usuario
			try {
				opcion = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException e1) {
				System.out.println("El programa termino");
				return;
			} catch (IOException e1) {
				
				System.out.println("El programa termino");
				return;
			}


			switch(opcion) {
			case 1:
				// Opción para generar codigo morse
				System.out.println("Favor de ingresar el texto");
				try {
					textoEntrada = reader.readLine().toLowerCase();
				} catch (IOException e1) {
					System.out.println("Error al leer el texto");
				}
				System.out.println(code.Generar(textoEntrada.toUpperCase()));
				break;
			case 2:
				// Opcion para decifrar codigo morse
				System.out.println("Favor de ingresar el codigo morse");
				try {
					textoEntrada = reader.readLine();
				} catch (IOException e) {
					System.out.println("Error al leer el texto");
				}
				System.out.println(code.Decodificar(textoEntrada));
				break;
			default:
				// Para salir del ciclo
				ciclo=false;
				System.out.println("El programa termino");
				break;
			}		
		}while(ciclo);
	}
}
