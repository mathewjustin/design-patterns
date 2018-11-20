package com.patterns.chain.of.responsibility;

public class Director extends Handler {

	@Override
	void handleRequests(Request request) {

		if (request.amount < 1000) {
			System.out.println("Director can handle under 1000");
		} else {
			successor.handleRequests(request);
		}
	}

}
