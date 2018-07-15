package com.comarch.ana.exceptions;

public class ANAIntegratorIOException extends ANAIntegratorException {
	public ANAIntegratorIOException(String message) {
		super(message);
		setErrorType(ErrorType.IO);
	}
    
	public ANAIntegratorIOException(String message, Throwable cause) {
		super(message, cause); 
		setErrorType(ErrorType.IO);
	}
}
