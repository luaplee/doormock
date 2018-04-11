package com.pccw.digitalstore.iotapimock.models;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ErrorDetails {
	
    private HttpStatus status;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;
    private String message;
    private String debugMessage;
    
    private ErrorDetails() {
        timestamp = LocalDateTime.now();
    }

    public ErrorDetails(HttpStatus status) {
        this();
        this.status = status;
    }

    public ErrorDetails(HttpStatus status, Throwable ex) {
        this();
        this.status = status;
        this.message = "Unexpected error";
        this.debugMessage = ex.getLocalizedMessage();
    }

    public ErrorDetails(HttpStatus status, String message, Throwable ex) {
        this();
        this.status = status;
        this.message = message;
        this.debugMessage = ex.getLocalizedMessage();
    }

	public HttpStatus getStatus() {
		return status;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDebugMessage() {
		return debugMessage;
	}

	@Override
	public String toString() {
		return "ErrorMessage [status=" + status + ", timestamp=" + timestamp + ", message=" + message
				+ ", debugMessage=" + debugMessage + "]";
	}

}
