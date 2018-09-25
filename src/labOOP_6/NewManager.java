package labOOP_6;

public class NewManager implements NewEmployee {
	
	private String name;
	private String position;
	private String department;
	private double salary;
	
	public static void main(String[] arg) {
		NewManager m = new NewManager();
		m.setName("Simchai");
		m.setDepartment("Seller");
		m.setPosition("Manager");
		m.calSalary(50, 100);
		m.showDatails();
	}

	public double calSalary(int hour, double mph) {
		// TODO Auto-generated method stub
		this.salary = hour * mph;
		return this.salary;
	}

	public void showDatails() {
		// TODO Auto-generated method stub
		System.out.println("Name : " + this.name);
		System.out.println("Position :" + this.position);
		System.out.println("Department : " + this.department);
		System.out.println("Salary : " + this.salary);
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	public void setPosition(String pos) {
		// TODO Auto-generated method stub
		this.position = pos;
	}

	public void setDepartment(String d) {
		// TODO Auto-generated method stub
		this.department = d;
	}

}
