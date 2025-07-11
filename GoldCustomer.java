package com.ioc.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ioc.interfaces.CreditCard;

@Component
public class GoldCustomer implements CreditCard{
	
	private String type;
	private String hQ;

	@Override
	public void displayCustomer() {
		System.out.println(type + " has hQ at " +hQ);
		
	}

	@Autowired
	public void setType(@Value ("${gctype}")String type) {
		this.type = type;
	}
	
	@Autowired
	public void sethQ(@Value ("${gcHQ}")String hQ) {
		this.hQ = hQ;
	}
	
}
