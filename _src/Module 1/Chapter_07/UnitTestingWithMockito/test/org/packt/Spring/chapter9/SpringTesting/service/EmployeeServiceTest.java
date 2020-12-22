package org.packt.Spring.chapter9.SpringTesting.service;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.packt.Spring.chapter9.SpringTesting.dao.EmployeeDao;
import org.packt.Spring.chapter9.SpringTesting.modle.Employee;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

	private static final String OLD_EMPLOYEE_ID = "12121";
	private Employee oldEmployee;
	private EmployeeService employeeService;

	@Mock
	private EmployeeDao employeeDao;

	@Before
	public void setUp() {
		employeeService = new EmployeeServiceImpl(employeeDao);
		oldEmployee = new Employee(OLD_EMPLOYEE_ID, "Ravi", "Soni", 1001);
	}

	@Test
	public void findEmployeeTest() {
		when(employeeDao.findEmployee(OLD_EMPLOYEE_ID)).thenReturn(oldEmployee);
		Employee employee = employeeService.findEmployee(OLD_EMPLOYEE_ID);
		Assert.assertEquals(oldEmployee, employee);

		// Verifies findEmployee behavior happened once
		verify(employeeDao).findEmployee(OLD_EMPLOYEE_ID);

		// asserts that during the test, there are no other calls to the mock
		// object.
		verifyNoMoreInteractions(employeeDao);
	}

	@Test
	public void notFindEmployeeTest() {
		when(employeeDao.findEmployee(OLD_EMPLOYEE_ID)).thenReturn(null);
		Employee employee = employeeService.findEmployee(OLD_EMPLOYEE_ID);
		Assert.assertNotSame(oldEmployee, employee);

		verify(employeeDao).findEmployee(OLD_EMPLOYEE_ID);

		// Verifies that no interactions happened on employeeDao mocks
		verifyZeroInteractions(employeeDao);
		verifyNoMoreInteractions(employeeDao);
	}
}
