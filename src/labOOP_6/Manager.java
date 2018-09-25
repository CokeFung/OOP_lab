package labOOP_6;

public class Manager extends Employee {
	protected String department;
	
	public Manager() {
		
	}
	
	public Manager(String name, String department) {
		this.name = name;
		this.department = department;
		this.position = new String("Manager");
	}
	
	public void showDetails() {
		System.out.println("Name : " + this.name);
		System.out.println("Position : " + this.position);
		System.out.println("Department : " + this.department);
		System.out.println("Salary : " + this.salary + "\n");
	}
	
}
