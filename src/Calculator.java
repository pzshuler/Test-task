import java.io.IOException;
import java.util.Scanner;

public class Calculator {
	static String playAgain;
	public static void main(String[] args) throws IOException {
		 
		ArabicNumeral ob = new ArabicNumeral();
		RomanNumeral ob1 = new RomanNumeral();
do {		
		ob.inputNums();
		
	if(isDigit(ob.a, ob.c)) {
		ob.inputArabicAritmeticExpression();
		if(ob.q != 0 & ob.q <= 10 & ob.w != 0 & ob.w <= 10) {
	    	  ob.operation();
	      }
		else {
			System.out.println("Вводите числа от 1 до 10");
			System.out.println("Завершение работы");
			return;
		}
	}
	else {
		ob1.a = ob.a;
		ob1.b = ob.b;
		ob1.c = ob.c;
		
	
		ob1.inputRomanArithmeticExpression();
		
		if(ob1.q != 0 & ob1.q <= 10 & ob1.w != 0 & ob1.w <= 10) {
	    	  ob1.operation();
	      }
		
		else {
			System.out.println("Вводите числа от I до X");
			System.out.println("Завершение работы");
			return;
		}
		
	}
	
	System.out.println("Ввести новое значение 'y' - да, 'n' - нет");
	Scanner scan = new Scanner(System.in);
 playAgain = scan.next();
	} while(playAgain.equalsIgnoreCase("y"));
	}
		
		
	static boolean isDigit(String a, String c) {
		try {
			Integer.parseInt(a);
			Integer.parseInt(c);
			return true;
		} catch(NumberFormatException e){
			return false;
		}
	}
}
