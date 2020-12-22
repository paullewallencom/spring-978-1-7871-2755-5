package src.org.packt.Spring.chapter2.setterinjection.empty;

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
		Employee employeeService = (Employee) context.getBean("employeeBean");
		System.out.println(employeeService.getEmployeeName());

	}

}
