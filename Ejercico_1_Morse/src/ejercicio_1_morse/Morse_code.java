package ejercicio_1_morse;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Morse_code {
	public Map<String, String> library = new HashMap<String, String>();
	
	public Morse_code() {
		library.put(".-", "A");
		library.put("-...", "B");
		library.put("-.-.", "C");
		library.put("-..", "D");
		library.put(".", "E");
		library.put("..-.", "F");
		library.put("--.", "G");
		library.put("....", "H");
		library.put("..", "I");
		library.put(".---", "J");
		library.put("-.-", "K");
		library.put(".-..", "L");
		library.put("--", "M");
		library.put("-.", "N");
		library.put("---", "O");
		library.put(".--.", "P");
		library.put("--.-", "Q");
		library.put(".-.", "R");
		library.put("...", "S");
		library.put("-", "T");
		library.put("..-", "U");
		library.put("...-", "V");
		library.put(".--", "W");
		library.put("-..-", "X");
		library.put("-.--", "Y");
		library.put("--..", "Z");

		library.put(".----", "1");
		library.put("..---", "2");
		library.put("...--", "3");
		library.put("....-", "4");
		library.put(".....", "5");
		library.put("-....", "6");
		library.put("--...", "7");
		library.put("---..", "8");
		library.put("----.", "9");
		library.put("-----", "0");
	}
	
	// Creamos el codigo morse
		public String Generar(String line) {
			String aux="";
			for(String morse: line.split("")){
				// Separamos el codigo morse con tres espacios
				if(morse.equals(" ")) {
					aux = aux + "  ";
				}else {
					// Obtenemos el valor del Hashmap
					for(Entry<String, String> entry: library.entrySet()) {
						if(morse.equals(entry.getValue())) {
							aux = aux + entry.getKey() + " ";
							break;
						}
					}
				}
			}
			return aux;
		}

		// Deciframos el codigo morse
		public String Decodificar(String line) {
			StringBuffer buff = new StringBuffer();
			boolean aux = false;
			for (String s : line.split(" ")) {
				if (s.equals("")) {
					if(aux==false) {
						buff.append(" ");
						aux = true;
					}else {
						aux = false;
					}
				}				
				else {
					buff.append(library.get(s));
				}				
			}
			return ""+buff;
		}
}
