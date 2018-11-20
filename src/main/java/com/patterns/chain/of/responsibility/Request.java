package com.patterns.chain.of.responsibility;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Request {

	public enum Types{
		CONFERENCE,PURCHASE
	}
	
	Types type;
	Integer amount;
	
}
