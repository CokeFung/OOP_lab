package labOOP_4;

public class Rectangle {

	private double width = 1;
	private double height = 1;
	private static String color = "white";
	
	public Rectangle() {
		
	}
	
	public Rectangle(double w, double h, String c) {
		width = w;
		height = h;
		color = c;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	
	public void setColor(String c) {
		color = c;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public String getColor() {
		return color;
	}
	
	public double findArea() {
		return width * height;
	}
}
