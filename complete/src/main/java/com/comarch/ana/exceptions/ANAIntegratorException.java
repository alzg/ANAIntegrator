package com.comarch.ana.exceptions;

import com.comarch.ana.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ANAIntegratorException extends Exception {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public enum ErrorType {GENERAL, HTTP, IO, DB};
	
	private ErrorType errorType = ErrorType.GENERAL;
	
    protected ANAIntegratorException(String message) {
		super(message); 
	}
    
	protected ANAIntegratorException(String message, Throwable cause) {
		super(message, cause); 
	}
    
	protected ANAIntegratorException(ErrorType errorType, String message) {
		super(message);
		this.errorType = errorType;
	}
    
	protected ANAIntegratorException(ErrorType errorType, String message, Throwable cause) {
		super(message, cause); 
		this.errorType = errorType;
	}
	
    public String getMessage() {
    	return getErrorTypeStr() + ": " + super.getMessage();
    } // getMessage
    
	public ErrorType getErrorType() {
		return errorType;
	}
	
	public String getErrorTypeStr() {
		if (errorType == ErrorType.HTTP) return "HTTP ERROR";
		if (errorType == ErrorType.DB) return "DB ERROR";
		if (errorType == ErrorType.IO) return "IO ERROR";
		return "GENERAL ERROR";
	}
	
	protected void setErrorType(ErrorType errorType) {
		this.errorType = errorType;
		log .error(getMessage(), this);
	}
}
