package com.wenderson.gerenciausuarios.services.exceptions;

public class DataIntegrityViolationException extends RuntimeException {
	private static final long serialVersionUID = 874702803340960963L;

	public DataIntegrityViolationException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataIntegrityViolationException(String message) {
		super(message);
	}

}
