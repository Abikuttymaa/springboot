package com.example.demo.exceptionhandling;

import java.util.Date;

public class ErrorResponse {

	 private int statusCode;
	  private Date timestamp;
	  private String message;
	  private String description;

	  public ErrorResponse(int statusCode, Date timestamp, String description, String message) {
	    this.statusCode = statusCode;
	    this.timestamp = timestamp;
	    this.message = message;
	    this.description = description;
	  }

	  public ErrorResponse() {
		
	}

	public int getStatusCode() {
	    return statusCode;
	  }

	  public Date getTimestamp() {
	    return timestamp;
	  }
	  public String getMessage() {
		    return message;
		  }

	  public String getDescription() {
		    return description;
		  }

	public void setStatus(int value) {
		
	}

	public void setMessage(String message2) {
		
	}

	public void setTimeStamp(long currentTimeMillis) {
		
	}

}

