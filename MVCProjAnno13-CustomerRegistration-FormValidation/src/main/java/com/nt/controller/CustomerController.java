//CustomerController.java
package com.nt.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Customer;
import com.nt.service.ICustomerMgmtService;
import com.nt.validator.CustomerValidator;

@Controller
public class CustomerController {
	@Autowired
	private ICustomerMgmtService service;
	@Autowired
	private  CustomerValidator  validator;
	
	@GetMapping("/customer")
	public  String showForm(@ModelAttribute("cust") Customer cust) {  //initial phase request (form launching)
		 cust.setCadd("hyd");
		 //return lvn
		 return "customer_form";
	}
	
	@PostMapping("/customer")
	public String  registerCustomer(@ModelAttribute("cust") Customer cust,
			                                             BindingResult errors,
			                                             RedirectAttributes redirectAttrs) { // Post back request (form submission)
		
	  //pefrom server side form validations only when client side form valdations are not done
		if(cust.getVflag().equalsIgnoreCase("no")){
     		//perform form validations..
	     	if(validator.supports(cust.getClass()))
		     	      validator.validate(cust, errors);
		
		     if(errors.hasErrors())  //if form validation errors are there
			       return "customer_form"; // lvn
		}//if
		
		
		//Application Logic errors
		if(cust.getBillAmt()>100000) {
			errors.rejectValue("billAmt","billAmt.big");
			return "customer_form";
		}
		
		
		  
		  //use  service
		String resultMsg=service.register(cust);
		//keep result in RedirectAttributes object
		  redirectAttrs.addFlashAttribute("resultMsg", resultMsg);  // make this model data avaliable to next redirected request..
		  redirectAttrs.addFlashAttribute("modelData", cust);
		  //return LVN
		return "redirect:show";
	}
	
	@GetMapping("/show")
	public  String  showResultPage() {
		//return lvn
		return  "result";
	}
	
	
	
	

}