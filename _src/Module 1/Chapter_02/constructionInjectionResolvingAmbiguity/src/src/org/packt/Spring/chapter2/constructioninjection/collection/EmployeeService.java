package src.org.packt.Spring.chapter2.constructioninjection.collection;

public class EmployeeService {

	private String employeeName;
	private int employeeAge;
	private String employeeId;

	EmployeeService(String employeeName, int employeeAge, String employeeId) {
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeId = employeeId;
	}

	EmployeeService(String employeeName, String employeeId, int employeeAge) {
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Employee Name: " + employeeName + " Age: " + employeeAge
				+ " EmployeeId: " + employeeId;
	}

}
