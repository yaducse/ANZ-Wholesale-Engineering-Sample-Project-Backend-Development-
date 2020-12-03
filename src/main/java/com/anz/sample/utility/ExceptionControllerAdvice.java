package com.anz.sample.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.anz.sample.exception.ANZSampleProjectException;


@RestControllerAdvice
public class ExceptionControllerAdvice {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Environment environment;

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorInfo> generalExceptionHandler(Exception exception) {
		
		logger.error(exception.getMessage(), exception);
		
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		errorInfo.setErrorMessage(environment.getProperty(ANZSampleProjectConstants.GENERAL_EXCEPTION_MESSAGE.toString()));

		return new ResponseEntity<>(errorInfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(ANZSampleProjectException.class)
	public ResponseEntity<ErrorInfo> weCareExceptionHandler(ANZSampleProjectException anzSampleProjectException) {
		
		logger.error(anzSampleProjectException.getMessage(), anzSampleProjectException);
		
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(HttpStatus.BAD_REQUEST.value());
		errorInfo.setErrorMessage(environment.getProperty(anzSampleProjectException.getMessage()));

		return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
	}

}
