package com.wenderson.gerenciausuarios.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -6785897530225276181L;

	public ObjectNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ObjectNotFoundException(String message) {
		super(message);
	}

}
