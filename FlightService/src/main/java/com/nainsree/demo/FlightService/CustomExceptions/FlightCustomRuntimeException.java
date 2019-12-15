package com.nainsree.demo.FlightService.CustomExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class FlightCustomRuntimeException extends RuntimeException {

	public FlightCustomRuntimeException() {
		// TODO Auto-generated constructor stub
	}

	public FlightCustomRuntimeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public FlightCustomRuntimeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public FlightCustomRuntimeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public FlightCustomRuntimeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}