package src.org.packt.Spring.chapter2.constructioninjection.simplejavatype;

public class EmployeeService {

	private String greeting;

	EmployeeService(String message) {
		this.greeting = message;
	}
	
	@Override
	public String toString() {
		return greeting;
	}

}
