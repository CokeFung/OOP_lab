package labOOP_1;


public class SolutionFinder {

	public static void main(String[] args) {
		
		double a = 4, b = 8, c = 3, x1, x2;
		
		x1 = ((-1*b)+Math.sqrt(b*b - a*c*4)) / (2*a);
		x2 = ((-1*b)-Math.sqrt(b*b - a*c*4)) / (2*a);
		
		System.out.println(x1);
		System.out.println(x2);
	}
}
