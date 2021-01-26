package com.nt.dto;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.nt.bo.BaseBean;

@Component("empDTO")
@Scope("prototype")
public class EmployeeDTO extends BaseBean implements Serializable {

	
	private String company;
	private float Salary;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [company=" + company + ", Salary=" + Salary + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
