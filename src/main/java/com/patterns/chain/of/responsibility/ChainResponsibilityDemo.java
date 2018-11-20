package com.patterns.chain.of.responsibility;

import com.patterns.chain.of.responsibility.Request.Types;

public class ChainResponsibilityDemo {
	public static void main(String[] args) {

		
		CEO jeff= new CEO();
		VP rama=new VP();
		Director venkat=new Director();
		
		rama.setSuccessor(jeff);
		venkat.setSuccessor(rama);
		
		Request request_1=new Request(Types.CONFERENCE,1200);
		venkat.handleRequests(request_1);
		
	}
}
