package com.nt.beans;

public class TestBean {
 private int a,b;

private TestBean(int a, int b) {
	System.out.println("TestBean::2-param constructor(private)");
	this.a = a;
	this.b = b;
}

@Override
public String toString() {
	return "TestBean [a=" + a + ", b=" + b + "]";
}


 
}
