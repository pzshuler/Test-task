import java.io.*;

public class ArabicNumeral {
	
	String a, b, c;
	int q, w;
	
	void inputNums() throws IOException  {
		BufferedReader reader = new 
				  BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("������� ��������������"
				+ " ���������: ");
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
	        else { System.out.println("������� ���������� ������"
	        		+ " �������������� ��������");
	      
	        }
	}
	
}


