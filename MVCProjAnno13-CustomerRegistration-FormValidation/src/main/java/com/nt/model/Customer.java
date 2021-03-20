package com.nt.model;

import java.util.List;

import lombok.Data;

@Data
public class Customer {
	//private int cno;  //auto generated
	private String cname;
	private  String cadd;
	private  Float billAmt;
	private  String vflag="no";
	
}