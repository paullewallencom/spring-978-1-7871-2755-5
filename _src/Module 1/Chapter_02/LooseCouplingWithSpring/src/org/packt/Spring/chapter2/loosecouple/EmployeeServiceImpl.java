package org.packt.Spring.chapter2.loosecouple;

/**
 * 
 * @author RaviKantSoni
 * 
 */
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Long generateEployeeID() {

		return System.currentTimeMillis();

	}

}
