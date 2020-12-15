import java.io.*;

public class RomanNumeral {
	
	String a, b, c;
	int q = 0;
	int w = 0;
	
	static int[] arabicNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 
			12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 24, 25, 
			27, 28, 30, 32, 35, 36, 40, 42, 45, 48, 49, 50,
			54, 56, 60, 63, 70, 72, 90, 100};
	static String[] romeNums = {"I", "II", "III", "IV", "V", "VI", 
			"VII", "VIII", "IX", "X", "XI", "XII", "XIII", 
			"XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
			"XXI", "XXIV", "XXV", "XXVII", "XXVIII", "XXX",
			"XXXII", "XXXV", "XXXVI", "XL", "XLII", "XLV", 
			"XLVIII", "XLIX", "L", "LIV", "LVI", "LX", 
			"LXIII", "LXX", "LXXII", "XC", "C"};
	
	void inputNums() throws IOException  {
		BufferedReader reader = new 
				  BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Введите арифмитическое"
				+ " выражение: ");
		String[] data =
        		reader.readLine().split(" ");
        a = data[0];
        b = data[1];
        c = data[2];
	}
	
	void inputRomanArithmeticExpression() {
	        
	        for(int i = 0; i < romeNums.length; i++){
	   		 
	   		 if(a.equals(romeNums[i]))  q = arabicNums[i];
	   		 
	   		 if(c.equals(romeNums[i]))  w = arabicNums[i]; 
	   	 }
	}
	
	void operation() {
		        
		 String result = "";
		         
		        if (b.equals("+")) {
		            int z = q + w;
		          for(int i = 0; i < arabicNums.length; i++) {
		        	  if(z == arabicNums[i]) {
		        		  result = romeNums[i];
		        	  } 
		          } 
		          System.out.println(result);   
		        }
		        
		        else if (b.equals("-")) {
		            int z = q - w;
		          for(int i = 0; i < arabicNums.length; i++) {
		        	  if(z == arabicNums[i]) {
		        		  result = romeNums[i];
		        	  } 
		          } 
		          System.out.println(result);   
		        }
		        
		        else if (b.equals("*")) {
		            int z = q * w;
		          for(int i = 0; i < arabicNums.length; i++) {
		        	  if(z == arabicNums[i]) {
		        		  result = romeNums[i];
		        	  } 
		          } 
		          System.out.println(result);   
		        }
		        
		        else if (b.equals("/")) {
		            int z = q / w;
		          for(int i = 0; i < arabicNums.length; i++) {
		        	  if(z == arabicNums[i]) {
		        		  result = romeNums[i];
		        	  } 
		          } 
		          System.out.println(result);   
		        }   
		        else {
		        	System.out.println("Введите корректный символ "
		        			+ "арифметической операции");
		        	
		        }
	}
	
}
	        
	      
	        
	


