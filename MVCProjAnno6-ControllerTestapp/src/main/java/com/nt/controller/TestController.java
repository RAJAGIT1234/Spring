package com.nt.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@Autowired
	private ServletContext sc;
	
	@Autowired
	private ServletConfig sg;
	@RequestMapping("/welcome")
	public String showHome() {
		return "home";
	}
	@RequestMapping("/register")//Get
	public String saveData1() {
		return "result1";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)//Get
	public String saveData2() {
		
		System.out.println("displaying Employee");
		System.out.println("webapp name:"+sc.getContextPath());
		System.out.println("webapp path:"+sc.getRealPath("/"));
		return "result2";
	}
	
}
