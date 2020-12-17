package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.service.EmployeeMgmtService;

public class JdbcTemplateDirectMethodsTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeMgmtService service=null;
		//create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Service class object
		service=ctx.getBean("empService",EmployeeMgmtService.class);
		//Invoke the method
		try {
			System.out.println("emp count::"+service.fetchEmpscount());
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		System.out.println("--------------------");
		try {
			System.out.println("7499 emp name::"+service.fetchEmpNameByNo(7499));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		System.out.println("--------------------");
		try {
			System.out.println("7499 emp details::"+service.fetchEmpDetailsByNo(7499));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		System.out.println("--------------------");
		try {
			System.out.println("7876 emp details::"+service.fetchEmpDetailsByNo(7499));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		System.out.println("--------------------");
		try {
			//System.out.println("CLERK,MANAGER emp details::"+service.getEmpDetailsByDesgs("CLERK","MANAGER"));
		service.getEmpDetailsByDesgs("CLERK","MANAGER").forEach(map->{
			System.out.println(map);
		});
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}

//		System.out.println("--------------------");
//		try {
//			System.out.println(service.registerEmp("raja", "devloper", 40000));
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
		System.out.println("--------------------");
		try {
			System.out.println(service.putBounsToEmpByDesg("SALESMAN", 1000));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}

		//close container
		((AbstractApplicationContext) ctx).close();
	}//main

}//class
