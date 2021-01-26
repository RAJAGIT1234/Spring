package com.nt.beans;

import java.time.LocalDate;

public class SceduleRemainder {
  private LocalDate date;

public SceduleRemainder(LocalDate date) {
	System.out.println("SceduleRemainder::1-param constructor");
	this.date = date;
}
    public String Remainder() {
    	LocalDate sysDate=null;
    	//get System date
    	sysDate=LocalDate.now();
    	if(sysDate.isEqual(date))
		return "Reminder about Attending Board meeting"; 
		
    	else    	                     
    		return "no 

	}
  
}
