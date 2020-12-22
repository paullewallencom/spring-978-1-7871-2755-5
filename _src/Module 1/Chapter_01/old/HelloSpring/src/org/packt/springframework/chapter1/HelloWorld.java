package org.packt.springframework.chapter1;

public class HelloWorld {

	private String message;

	public void getMessage() {
		System.out.println("Message: " + this.message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
