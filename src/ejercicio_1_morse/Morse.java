package ejercicio_1_morse;

import java.io.IOException;
import java.util.Scanner;

public class Morse {
	
	public static final char[] abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

	public static final String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
	              ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
	              "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
	              "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
	              "-----"};
	
	public static void main(String args[])
    {
		  Scanner keyboard = new Scanner(System.in);
		  boolean ciclo = true;
		  
		  do {
			  System.out.println(" ============================================ ");
			  System.out.println(" Selecciona una opción del menú");
			  System.out.println(" 1) Generar codigo morse");
			  System.out.println(" 2) Descifrar codigo morse");
			  System.out.println(" 3) Presiona otra tecla para salir");
			  System.out.println(" ============================================ ");
			  
			  int opcion = keyboard.nextInt();
			  keyboard.nextLine();
			  switch(opcion) {
				  case 1:
					  System.out.println("Favor de ingresar el texto");
					  String userInput = keyboard.nextLine().toLowerCase();
					  //String userInput = "HOY ES".toLowerCase();
					  char[] chars = userInput.toCharArray();
					  System.out.println(Generar(chars));
					  break;
				  case 2:
					  break;
				  default:
					  
			  }		
		  }while(ciclo);
    }
	
	public static String Generar(char[] chars) {
		String str = "";
		  for (int i = 0; i < chars.length; i++){
		      for (int j = 0; j < abecedario.length; j++){
		          if (abecedario[j] == chars[i]){
		              str = str + morse[j] + " ";  
		          }
		      }
		  }
		  return str;
	}

}
