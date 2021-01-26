package com.nt.beans;


public interface WebContainer  {
	

	
	/*
	 * public WebContainer() {
	 * System.out.println("WebContainer:: 0-param constructor"); }
	 */
	
	
	 RequestHandler createRequestHandler();
	default   void  processRequest(String data) {
		
		RequestHandler handler=null;
		
		System.out.println("WebContainer is processing request with data::"+ data + "by giving it to handler");
		//get depedent object using depedency lookup code generated by container
		handler=createRequestHandler();
		//use depedent object
		handler.handleRequest(data);
		
	}

	

}