package labOOP_4;

public class TestRectangle {

	
		public static void main(String[] args) {
			
			Rectangle rect1 = new Rectangle();
			Rectangle rect2 = new Rectangle(10.5, 8, "red");
			
			rect1.setWidth(12);
			rect1.setHeight(5.5);
			rect1.setColor("yellow");
			
			System.out.println(rect1.getWidth());
			System.out.println(rect1.getHeight());
			System.out.println(rect1.getColor());
			
			System.out.println(rect2.getWidth());
			System.out.println(rect2.getHeight());
			System.out.println(rect2.getColor());
		}
	
}
