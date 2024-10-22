package org.packt.Spring.chapter2.tightcouple;

/**
 * <ol>
 * <li>employeeService is coupled tightly to EmployeeServiceImpl.</li>
 * <li>Every change of EmployeeServiceImpl may involve code change.</li>
 * <li>If this code is scattered all over of your project, every change of the
 * EmployeeServiceImpl will make you suffer seriously</li>
 * </ol>
 * 
 * @author RaviKantSoni
 * @JRE 1.7
 */
public class PayrollSystem {

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeServiceImpl();

		System.out.println(employeeService.generateEployeeID());

	}

}
