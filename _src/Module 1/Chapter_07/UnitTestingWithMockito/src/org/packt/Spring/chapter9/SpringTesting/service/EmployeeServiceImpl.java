package org.packt.Spring.chapter9.SpringTesting.service;

import org.packt.Spring.chapter9.SpringTesting.dao.EmployeeDao;
import org.packt.Spring.chapter9.SpringTesting.modle.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao = null;

	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Employee findEmployee(String employeeId) {
		return employeeDao.findEmployee(employeeId);
	}
}
