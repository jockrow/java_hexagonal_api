package com.test.api_rest.layer.presentation.advice;

import com.test.api_rest.layer.common.exception.UserException;
import com.test.api_rest.layer.domain.entity.User;
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
