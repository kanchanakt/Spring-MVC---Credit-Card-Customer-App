package com.ioc.benifits;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ioc.config.CardConfig;

@Component
public class GoldBenifits {
	
	private long creditLimit;
	private float interestRate;
	
	@Value("1000000")
	public void setCreditLimit(long creditLimit) {
		this.creditLimit = creditLimit;
	}
	@Value("12.12")
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
	public void dispBenifits() {
		System.out.println("the creditlimit is " +creditLimit + "at the interestRate of " + interestRate);
	}
	

}
