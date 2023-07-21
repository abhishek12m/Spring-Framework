package com.example.XMLbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Load the congig xml file and creating application context
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// Retreiving the bean from context
		MyBean myBean = context.getBean("myBean", MyBean.class);
		AnotherBean anotherBean = context.getBean("anotherBean", AnotherBean.class);
		// using the bean
		myBean.doSomething();
		anotherBean.doSomethingElse();
		((ClassPathXmlApplicationContext) context).close();
	}

}
