package src.org.packt.Spring.chapter2.constructioninjection.multiplejavatype;

public class EmployeeService {

	private String employeeName;
	private int employeeAge;
	private boolean married;

	EmployeeService(String employeeName, int employeeAge, boolean married) {
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.married = married;
	}

	@Override
	public String toString() {
		return "Employee Name: " + employeeName + " Age: " + employeeAge
				+ " Married: " + married;
	}

}
