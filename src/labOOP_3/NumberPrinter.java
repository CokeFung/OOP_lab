package labOOP_3;

import java.util.*;

public class NumberPrinter {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			int num = Integer.parseInt(input.next());
			
			for (int i = 1 ; i <= num ; i++) {
				for (int j = 1; j<= i; j++)
					System.out.print(i+" ");
				System.out.println(5);
			}
			
			input.close();
		
		}
}
