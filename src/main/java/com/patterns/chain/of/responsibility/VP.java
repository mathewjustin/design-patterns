package com.patterns.chain.of.responsibility;

public class VP extends Handler{

	@Override
	void handleRequests(Request request) {

		if(request.amount<1500)
		{
			System.out.println("VP can handle under 1500");
		}else
		{
			successor.handleRequests(request);
		}
	}

}
