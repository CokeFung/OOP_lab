package labOOP_6;

public class Employee {
	protected String name;
	protected String position;
	protected double salary;
	
	public Employee() {
		
	}
	
	public Employee(String name, String position) {
		this.name = name;
		this.position = position;
	}
	
	public double calSalary(int hour, double mph) {
		salary = hour * mph;
		return salary;
	}
	
	public void showDetails() {
		System.out.println("Name : " + this.name);
		System.out.println("Position : " + this.position);
		System.out.println("Salary : " + this.salary + "\n");
	}
}
