package labOOP_9;

import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] arg){
		
		Scanner input = new Scanner(System.in);
		double a, b,c, x1 = 0, x2 = 0, temp = 0;
		
		try {
			a = Double.parseDouble(input.next());
			b = Double.parseDouble(input.next());
			c = Double.parseDouble(input.next());
			temp = checkArithmetic(Math.sqrt(b*b - a*c*4));
			x1 = ((-1*b)+temp) / (2*a);
			x2 = ((-1*b)-temp) / (2*a);
			System.out.println(x1);
			System.out.println(x2);
		}
		catch (NumberFormatException e){
			System.out.println(e); 
		}
		catch (ArithmeticException e){
			System.out.println(e); 
		}
		
	}
	
	public static double checkArithmetic(double val) throws ArithmeticException{
		if (Double.isFinite(val) || Double.isNaN(val)){
			throw new ArithmeticException("Illegal value");
		}
		else{
			return val;
		}
	}
	
}