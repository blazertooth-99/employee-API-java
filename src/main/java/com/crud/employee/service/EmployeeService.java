package com.crud.employee.service;
import java.util.List;
import com.crud.employee.entity.Employee;
public interface EmployeeService {
	List<Employee> retrieveEmployee();
	List<String> retrieveFirstName();
	List<String> retrieveLastName();
	String retrieveEmployeeById(Long id);
}
