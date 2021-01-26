package com.nt.test;

import java.io.Closeable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Vehicle;

public class DependencyLookupTest {

	public static void main(String[] args) {
		  //create IOC container
		ApplicationContext ctx=null;
		Vehicle vehicle=null;
		//create  IOC Container 
		System.out.println("1 st container");
		//get Target class object
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		vehicle=ctx.getBean("vehicle",Vehicle.class);
		//invoke methodsb 
		   vehicle.journey("hyd", "vizag"); //version1
		//vehicle.journey("hyd","warangal",ctx); //version2
		//vehicle.journey("hyd","warangal",ctx,"engg"); //version3
		
		vehicle.entertainment();
		vehicle.soundHorn();
		vehicle.fillFuel();
		
		//close container
		((AbstractApplicationContext)ctx).close();
		

	}

}