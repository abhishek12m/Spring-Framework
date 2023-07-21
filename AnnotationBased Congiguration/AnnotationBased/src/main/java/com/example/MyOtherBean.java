package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyOtherBean {
	private MyBean myBean;

	@Autowired
	public MyOtherBean(MyBean myBean) {
		this.myBean = myBean;
	}

	public void execute() {
		myBean.displayMessage();
	}

}
