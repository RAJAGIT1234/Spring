package com.cb.locator;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.ipl.external.IIPLScoreComp;
import com.ipl.external.IPLScoreCompImpl;


public interface IPLScoreCompServiceLocator {
     final static IIPLScoreComp  extComp=new IPLScoreCompImpl();//earger instantation
	
	
	public static IIPLScoreComp getExtComp(){
	   
		return extComp;
	
	}

}
