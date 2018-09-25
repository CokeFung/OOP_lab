package labOOP_3;

import java.util.*;

public class Grading {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int score = Integer.parseInt(input.next());
			char grade;
			
			if (score >= 90 && score <= 100)
				grade = 'A';
			else if (score >=80 && score <= 89)
				grade = 'B';
			else if (score >= 70 && score <= 79)
				grade = 'C';
			else if (score >= 60 && score <= 69)
				grade = 'D';
			else if (score >= 0 && score <= 60)
				grade = 'F';
			else
				grade = 'E';
			
			if (grade != 'E')
				System.out.println(grade);
			else
				System.out.println("Invalid score");
			
			input.close();
		}
}
