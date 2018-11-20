package com.patterns.chain.of.responsibility;

public class CEO extends Handler {

	@Override
	void handleRequests(Request request) {
		System.out.println("CEO Can handle any request");
	}

}
