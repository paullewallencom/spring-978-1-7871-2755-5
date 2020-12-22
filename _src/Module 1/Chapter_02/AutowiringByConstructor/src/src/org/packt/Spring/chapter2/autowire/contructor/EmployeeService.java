package src.org.packt.Spring.chapter2.autowire.contructor;

public class EmployeeService {

	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public EmployeeService(Employee employee) {
		this.employee = employee;
	}

}
