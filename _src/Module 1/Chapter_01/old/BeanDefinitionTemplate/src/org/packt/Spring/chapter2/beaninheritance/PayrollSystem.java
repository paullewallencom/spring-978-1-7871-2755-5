package org.packt.Spring.chapter2.beaninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PayrollSystem {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		// using 'employeeBean'
		Employee employeeA = (Employee) context.getBean("employeeBean");
		System.out.println(employeeA);

		// using 'indianEmployee'
		Employee employeeB = (Employee) context.getBean("indianEmployee");
		System.out.println(employeeB);

	}

}
