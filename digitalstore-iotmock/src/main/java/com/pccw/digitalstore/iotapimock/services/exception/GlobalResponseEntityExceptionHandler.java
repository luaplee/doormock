package com.pccw.digitalstore.iotapimock.services.exception;

import static org.springframework.http.HttpStatus.CONFLICT;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.pccw.digitalstore.iotapimock.models.ErrorDetails;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice(annotations = RestController.class)
public class GlobalResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	  @ExceptionHandler(SampleException.class)
	  public final ResponseEntity<ErrorDetails> handleSampleException(SampleException ex, WebRequest request) {
		  System.out.println("sample");
	    ErrorDetails errorDetails = new ErrorDetails(CONFLICT,"sample", ex);
	    return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	  }

	  @ExceptionHandler(Exception.class)
	  public final ResponseEntity<ErrorDetails> handleAllExceptions(Exception ex, WebRequest request) {
		  System.out.println("test");
	    ErrorDetails errorDetails = new ErrorDetails(CONFLICT,"all", ex);
	    return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	  }
}
