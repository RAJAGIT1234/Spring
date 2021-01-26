package com.nt.beans;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class DataFactoryBean implements FactoryBean <LocalDate>{
	
 private int year;
 private int month;
 private int day;
 
 

	public DataFactoryBean(int year, int month, int day) {
		System.out.println("DataFactoryBean.DataFactoryBean()");
	this.year = year;
	this.month = month;
	this.day = day;
}

	@Override
	public LocalDate getObject() throws Exception {
		System.out.println("DataFactoryBean.getObject()");
		return LocalDate.of(year, month, day);
	}

	@Override
	public Class<?> getObjectType() {
		return LocalDate.class;
	}
	
	@Override
		public boolean isSingleton() {
			
			return false;
		}

}