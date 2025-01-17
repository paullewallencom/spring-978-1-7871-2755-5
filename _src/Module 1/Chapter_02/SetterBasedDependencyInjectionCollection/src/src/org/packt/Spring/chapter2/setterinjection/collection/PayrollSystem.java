package src.org.packt.Spring.chapter2.setterinjection.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @JRE 1.7
 * @author Ravi Kant Soni
 *
 */
public class PayrollSystem {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		// using 'employeeBean'
		EmployeeService employeeService = (EmployeeService) context.getBean("employeeServiceBean");
		System.out.println(employeeService);

	}

}
