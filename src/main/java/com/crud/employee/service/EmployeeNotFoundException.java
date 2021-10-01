package com.crud.employee.service;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException {
	public EmployeeNotFoundException() {
	super();
	}
	
}
