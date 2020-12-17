package com.nt.test;
   
	import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
	import com.nt.beans.WishMessageGenerator;
	public class ConstructorInjectionTest { 
		public static void main(String[] args) {
			Resource res=null;
			BeanFactory factory=null;
			WishMessageGenerator generator=null;
			
			//res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
			res=new FileSystemResource("D:\\Spring\\NTSP713\\IOCProj2-SetterInjection_POC\\src\\com\\nt\\cfgs\\applicationContext.xml");		
			factory=new XmlBeanFactory(res);
			generator=(WishMessageGenerator)factory.getBean("wmg");
			System.out.println(generator.generateWishMessage("raja"));
			} }

