package com.test.api_rest.presentation.advice;

import com.test.api_rest.common.exception.UserException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice {

	@ExceptionHandler(UserException.class)
	public ResponseEntity<String> handleEmptyInput(UserException emptyInputException) {
		return new ResponseEntity<String>(emptyInputException.getErrorMessage(), emptyInputException.getErrorCode());
	}

}
