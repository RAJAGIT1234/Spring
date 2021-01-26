package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WebContainer;

public class LMISolutionTest {
	
public static void main(String[] args) {
	

 ApplicationContext ctx=null;
 WebContainer wc=null;
 //Create IOC Container
 ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
 //get target bean object
 wc=ctx.getBean("container",WebContainer.class);
 
 //invoke the method
     wc.processRequest("hello");
	System.out.println("------------------------");
	wc.processRequest("hai");
	System.out.println("----------------------");
	wc.processRequest("123");
	
 
 //close container
 ((AbstractApplicationContext) ctx).close();
}
}
