package src.org.packt.Spring.chapter2.autowirebytype;

public class Employee {

	private int employeeId;

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	@Override
	public String toString() {
		return "employee id: " + employeeId;
	}
}
