package com.luv2code.jsf.hello;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class IncreaseCounter {
	
	private int counterValue;
	
	public IncreaseCounter() {}

	public int getCounterValue() {
		return counterValue;
	}

	public void setCounterValue(int counterValue) {
		this.counterValue = counterValue;
	}
	
	public String increaseCounterValue() {
		counterValue++;
		return "counter-value";
	}
	

}
