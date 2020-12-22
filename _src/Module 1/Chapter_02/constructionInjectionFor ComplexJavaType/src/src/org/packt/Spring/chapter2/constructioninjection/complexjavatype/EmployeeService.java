package src.org.packt.Spring.chapter2.constructioninjection.complexjavatype;

public class EmployeeService {

	private Employee employee;

	EmployeeService(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return employee.toString();
	}

}
