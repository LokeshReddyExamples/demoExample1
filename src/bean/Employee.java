package bean;
public class Employee {

	private String firtsName;
	private String lastName;
	private double salary;
	private String department;

	public Employee(String firtsName, String lastName, double salary, String department) {
		super();
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
	}

	public String getFirtsName() {
		return firtsName;
	}
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}