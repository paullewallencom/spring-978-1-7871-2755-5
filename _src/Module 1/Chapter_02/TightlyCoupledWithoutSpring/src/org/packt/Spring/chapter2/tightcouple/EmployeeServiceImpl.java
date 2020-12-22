package org.packt.Spring.chapter2.tightcouple;

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
