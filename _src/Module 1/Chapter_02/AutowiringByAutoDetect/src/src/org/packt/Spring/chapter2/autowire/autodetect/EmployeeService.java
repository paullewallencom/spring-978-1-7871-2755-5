package src.org.packt.Spring.chapter2.autowire.autodetect;

public class EmployeeService {

	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public EmployeeService(Employee employee) {
		this.employee = employee;
	}

}
