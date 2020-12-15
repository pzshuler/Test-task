import java.io.*;

public class ArabicNumeral {
	
	String a, b, c;
	int q, w;
	
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
	
	void inputArabicAritmeticExpression() {
	        q = Integer.parseInt(a);
	        w = Integer.parseInt(c);
	}
	
	void operation() {
		   if (b.equals("+")) {
	            System.out.println(q + w);      
	        }
	        else if(b.equals("-")) {
	        	System.out.println(q - w);   
	        }
	        else if(b.equals("*")) {
	        	System.out.println(q * w);   
	        }
	        else if(b.equals("/")) {
	        	System.out.println(q / w);
	        }
	        else { System.out.println("Введите корректный символ"
	        		+ " арифметической операции");
	      
	        }
	}
	
}


