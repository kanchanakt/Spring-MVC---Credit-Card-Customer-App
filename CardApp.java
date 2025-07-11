package com.ioc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.classes.GoldCustomer;
import com.ioc.classes.PlatinumCustomer;
import com.ioc.config.CardConfig;

public class CardApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext aca = new AnnotationConfigApplicationContext(CardConfig.class);
		GoldCustomer gc = (GoldCustomer) aca.getBean("goldCustomer");
		PlatinumCustomer pc = (PlatinumCustomer) aca.getBean("platinumCustomer");
		
		gc.displayCustomer();
		pc.displayCustomer();
	}
}
