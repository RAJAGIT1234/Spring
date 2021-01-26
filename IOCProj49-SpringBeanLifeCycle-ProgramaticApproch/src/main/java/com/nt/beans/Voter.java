package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Voter implements InitializingBean,DisposableBean{
   private String name;
   private float age;
   private Date dov;
  
   
   public Voter() {
	   System.out.println("Voter::0-Param Consstructor");
   }

public void setName(String name) {
	System.out.println("Voter.setName()");
	this.name = name;
}

public void setAge(float age) {
	System.out.println("Voter.setAge()");
	this.age = age;
}

public void setDov(Date dov) {
	System.out.println("Voter.setDov()");
	this.dov = dov;
}
/*
 * public void myInit() { System.out.println("Voter.myInit()"); dov=new
 * Date();//initializing left over property boolean flag=false; if(name==null) {
 * System.out.println("Name must not be null"); flag=true; } if(age<0)
 * age=age*-1; if(age>100) { System.out.println("age must not>100"); flag=true;
 * } if(flag) throw new IllegalArgumentException("invalid inputs"); }
 */

//destory life cycle method
/*
 * public void myDestroy() { System.out.println("Voter.myDestroy()");
 *  //nulify
 * bean properties name=null; age=0; dov=null; }
 */

 //b.method
public String checkVotingElgibility() {
	System.out.println("Voter.checkVotingElgibility()");
	//b.logic
	if(age>=18)
		return "mr/mrs/miss +name+ u are eligiblie for voting  ->"+dov;
	else
		return "mr/mrs/miss +name+ u are not eligiblie for voting  ->"+dov;
		
}//method

@Override
public void destroy() throws Exception {
	System.out.println("Voter.destroy()");
	//nulify
	 name=null;
	 age=0;
	 dov=null;
}

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("Voter.afterPropertiesSet()");
	     dov=new Date();//initializing left over property
	     boolean flag=false;
	     if(name==null) {
			  System.out.println("Name must not be null");
			  flag=true;
			  } 
	     if(age<0)
			 age=age*-1;
	     if(age>100) {
	    	 System.out.println("age must not>100");
	    	 flag=true;
			  } 
	     if(flag) throw new IllegalArgumentException("invalid inputs"); 
			 
}
   
}//class
