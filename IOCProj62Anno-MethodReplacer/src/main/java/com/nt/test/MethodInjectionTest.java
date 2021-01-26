package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.target.BankLoanMgmt;

public class MethodInjectionTest {
public static void main(String[] args) {
	
	ApplicationContext ctx=null;
	BankLoanMgmt bank=null;
	//create IOC COntainer
	ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	//get target class objct
	bank=ctx.getBean("bank",BankLoanMgmt.class);
	//invoke the method
	System.out.println("Interst Amount:::"+bank.calculateIntrestAmount(10000, 2, 24));
	//close container
	((AbstractApplicationContext)ctx).close();
} 
}
