package com.nt.test;

import java.awt.FlowLayout;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;

public class I18nTest {

	public static void main(String[] args) {
		Locale locale=null;
		ResourceBundle bundle=null;
		JFrame frame=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null;
		//Prepare local object having language and country
		locale=new Locale(args[0],args[1]);
		//Create ResourceBundle object having Locale object
		bundle=ResourceBundle.getBundle("com/nt/commons/App",locale);
		//read and displays value
		System.out.println(bundle.getString("btn1.cap")+" "+bundle.getString("btn2.cap")+" "+bundle.getString("btn3.cap")+" "+bundle.getString("btn4.cap"));
	
		frame=new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setSize(200,300);
	} 
}
