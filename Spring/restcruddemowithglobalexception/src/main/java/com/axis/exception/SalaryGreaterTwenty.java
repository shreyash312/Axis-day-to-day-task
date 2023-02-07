package com.axis.exception;

public class SalaryGreaterTwenty extends RuntimeException{

	String msg;

	public SalaryGreaterTwenty(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	
}
