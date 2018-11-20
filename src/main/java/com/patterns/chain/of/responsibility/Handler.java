package com.patterns.chain.of.responsibility;

import lombok.Data;

@Data
public abstract class Handler {

	protected Handler successor;
	
	abstract void handleRequests(Request request);
	
}
