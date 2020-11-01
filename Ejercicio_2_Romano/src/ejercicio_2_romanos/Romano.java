package ejercicio_2_romanos;

public class Romano {
	private int num[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
    private String sym[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
    
    public String intToRoman(int number) {
		String res = "";
		int i=sym.length-1;    
        while(number>0) {
          int div = number/num[i];
          number = number%num[i];
          while(div>0) {
            res +=sym[i];
            div--;
          }
          i--;
        }		
		return res;
	}
}
