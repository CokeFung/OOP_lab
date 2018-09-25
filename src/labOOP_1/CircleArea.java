package labOOP_1;

import java.util.*;

public class CircleArea {

		public static void main(String[] args) {
			double radius, area, PI = Math.PI;
			Scanner input = new Scanner(System.in);
			
			radius = input.nextDouble();
			area = PI * Math.pow(radius, 2);
			System.out.println(area);
			input.close();
		}
}
