package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Flipkart fpkt=null;
		//Create IOC Container
      ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");	
      //get bean
      fpkt=ctx.getBean("fpkt",Flipkart.class);
     //invoke the method
	System.out.println(fpkt.shopping(new String[] {"PPEKit"," MASK","Sanitizer"},new float[] {2000,500,200}));
	//close container
	((AbstractApplicationContext)ctx).close();
	}//main
}//class