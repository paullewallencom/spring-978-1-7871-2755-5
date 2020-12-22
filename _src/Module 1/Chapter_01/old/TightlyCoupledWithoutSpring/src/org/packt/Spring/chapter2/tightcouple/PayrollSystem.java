package org.packt.Spring.chapter2.tightcouple;

/**
 * <ol>
 * <li>employeeService is coupled tightly to EmployeeServiceImp.</li>
 * <li>Every change of EmployeeServiceImp may involve code change.</li>
 * <li>If this code is scattered all over of your project, every change of the
 * EmployeeServiceImp will make you suffer seriously</li>
 * </ol>
 * 
 * @author RaviKantSoni
 */
public class PayrollSystem {

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeServiceImp();

		System.out.println(employeeService.generateEployeeID());

	}

}
