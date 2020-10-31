package ejercicio_2_romanos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class main_romanos {

	public static void main(String[] args) {
		String userInput;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println(" ============================================ ");
		System.out.println(" Numeros Romanos");
		System.out.println(" Ingresa el numero a convertir");
		System.out.println(" ============================================ ");

		try {
			userInput = reader.readLine().toUpperCase();
			System.out.println(romanToInt(userInput));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Scanner sc = new Scanner(System.in);
		// s = sc.nextLine();
		
//		System.out.println(romanToInt("MDCCLX"));
		
	}

	public static int romanToInt(String s) {
		// Create a empty hash map.
		HashMap<Character, Integer> map = new HashMap<>();

		// Putting value in hash map.
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = 0;

//		// initialize loop to iterate in string.
//		for (int i = 0; i < s.length(); i++) {
//
//			// Checking that current element
//			// is not smaller then previous
//			if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
//				result += map.get(s.charAt(i));
//			} else {
//				result += map.get(s.charAt(i));
//			}
//			System.out.println(result);
//		}
		for (int i = 0; i < s.length(); i++) {
			if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
				System.out.println("Entro"+result);
				result += map.get(s.charAt(i))-map.get(s.charAt(i - 1));;
				
			}else
			{
				result += map.get(s.charAt(i));
			}
		}
		
		return result;
	}
	
	public static int romanToIntOld(String s) {
		// Create a empty hash map.
		HashMap<Character, Integer> map = new HashMap<>();

		// Putting value in hash map.
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		// Creating integer variable to store result.
		int result = 0;

		// initialize loop to iterate in string.
		for (int i = 0; i < s.length(); i++) {

			// Checking that current element
			// is not smaller then previous
			if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
				result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
			} else {
				result += map.get(s.charAt(i));
			}
			//System.out.println(result);
		}
		// Returning the integer value of Roman number.
		return result;
	} 
}
