package com.nt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Employee;

@Controller
public class EmployeeReportController {
	
	@GetMapping("/welcome")
	public  String showHome() {
		return "home";
	}
	
	@GetMapping("/report")
	public  String  generateReport(Map<String,Object> map, @RequestParam  String type) {
		
		Employee emp1=new Employee(9001,"rajesh","hyd", 9000.0f);
		Employee emp2=new Employee(9002,"suresh","hyd",6000.0f);
		Employee emp3=new Employee(9003,"ramesh","vizag",7000.0f);
		Employee emp4=new Employee(9004,"raja","hyd", 10000.0f);
        Employee emp5=new Employee(9005,"atanu","hyd", 127666.0f);
		Employee emp6=new Employee(9007,"sritam","hyd", 19733.0f);

		List<Employee> list=List.of(emp1,emp2,emp3,emp4,emp5);
		//keep data in model attribute
		map.put("empList", list);
		
		//return lvn
		if(type.equalsIgnoreCase("pdf"))
		  return "pdfReport";
		else
			return "excelReport";
	}

}