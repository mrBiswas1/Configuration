package com.kodewala.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean("order")
	public Order createOrderBean()
	{
		Order order = new Order	();
		
		order.setItemName("Iphone16");
		order.setOrderId(12345);
		order.setOrderStatus("Out off delivery");
		
		return order;
		
	}	

}
