package com.Projectapp.exception;

public class UserExceptionNotFound extends RuntimeException{

	public UserExceptionNotFound(Long id) {
		super("THis is not found : " +id);
	}	
	

}
