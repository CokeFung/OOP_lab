package labOOP_3;

import java.util.*;

public class Factorial {
	
		public static void main(String[] args) {
			int n, sum = 0, temp;
			Scanner input = new Scanner(System.in);
			n = Integer.parseInt(input.next());
			
			for (int i = 1 ; i<= n;i++) {
				temp = 1;
				for (int j = 1;j<=i;j++)
					temp *= j;
				sum += temp;
				
			}
			
			System.out.println(sum);
			input.close();
			
		}
}
