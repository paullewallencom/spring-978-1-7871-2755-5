package org.packt.Spring.chapter2.callbacks;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 
 * @author RaviKantSoni
 * 
 */
public class EmployeeServiceImpl implements EmployeeService, InitializingBean,
		DisposableBean {

	@Override
	public Long generateEployeeID() {

		return System.currentTimeMillis();

	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("Employee destroy... ");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Employee afterPropertiesSet... ");

	}

}
