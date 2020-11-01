package ejercicio_2_romanos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class main_romanos {

	public static void main(String[] args) {
		String userInput;
		Romano convertir = new Romano();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println(" ============================================ ");
		System.out.println(" Numeros Romanos");
		System.out.println(" Ingresa el numero a convertir");
		System.out.println(" ============================================ ");

		try {
			userInput = reader.readLine().toUpperCase();
			System.out.println(convertir.intToRoman(Integer.parseInt(userInput)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

	public static int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<>();

		// Asignamos los valores
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = 0;
		int prev = 0;
		
		// MMXVIII
		for(int i = s.length()-1; i>=0 ; i--) {
            int temp = map.get(s.charAt(i));
            if(temp < prev) {
            	result -= temp;
            }                
            else {
            	result += temp;
            }            	
            prev = temp;
	    }
		
		return result;
	}
}
