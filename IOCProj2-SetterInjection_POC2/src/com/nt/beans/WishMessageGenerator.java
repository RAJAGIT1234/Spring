package com.nt.beans;
import java.util.Date;
public class WishMessageGenerator {
//bean propeerty
	private Date date;
	static {
		System.out.println("WishMessageGenerator:: static block");
	}
	
	
	 
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator.WishMessageGenerator:: 1 -param constructor");
		this.date = date;
	}



	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		int hour=0;
		hour=date.getHours();
		if(hour<12)
			return "Good Morning::"+user;
		else if(hour<16)
			return "Good Afternoon::"+user;
		else if(hour<20)
			return "Good Evening::"+user;
		return user;
		
	}
}
