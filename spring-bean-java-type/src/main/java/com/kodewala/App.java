package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.kodewala.spring.Order;
import com.kodewala.spring.SpringConfig;

public class App 
{
	 public static void main( String[] args )
	    {
	      ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
	      
	      Order order = (Order) context.getBean("order");
	      
	      System.out.println("Item name: " + order.getItemName());
	      System.out.println("Item Id: " + order.getOrderId());
	      System.out.println("Item ststus: " + order.getOrderStatus());
	      
	      ((AbstractApplicationContext) context).close();
	    }
}
