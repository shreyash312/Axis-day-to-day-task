package com.axis.exception;

public class InvalidAgeException extends RuntimeException{

	String msg;

	public InvalidAgeException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	
}
