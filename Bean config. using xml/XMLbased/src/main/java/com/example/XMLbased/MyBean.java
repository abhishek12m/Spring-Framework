package com.example.XMLbased;

public class MyBean {
	private String property1;
	private AnotherBean property2;

	public String getProperty1() {
		return property1;
	}

	public void setProperty1(String property1) {
		this.property1 = property1;
	}

	public AnotherBean getProperty2() {
		return property2;
	}

	public void setProperty2(AnotherBean property2) {
		this.property2 = property2;
	}

	public void doSomething() {
		System.out.println("doing something with myBean");
		System.out.println("property 1:" + property1);
		System.out.println("property 2:" + property2);
	}

}
