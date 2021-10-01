package com.crud.employee.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.employee.entity.Employee;
import com.crud.employee.service.EmployeeNotFoundException;
import com.crud.employee.repo.EmployeeRepo;
import com.crud.employee.service.EmployeeService;


import lombok.RequiredArgsConstructor;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	public void setEmployeeRepo(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
	}
	
	@PostMapping("/employee")
	public void postEmployee(@RequestBody Employee employees) {
		Employee employee = new Employee();
		employee.setFirstName(employees.getFirstName());
		employee.setLastName(employees.getLastName());
		employee.setSalary(employees.getSalary());
		employeeRepo.save(employee);
	}
	@PostMapping("/employee/{id}")
	public void putEmployee(@PathVariable long id, @RequestBody Employee employees) {
		Employee employee = new Employee();
		employee.setEmployeeId(id);
		employee.setFirstName(employees.getFirstName());
		employee.setLastName(employees.getLastName());
		employee.setSalary(employees.getSalary());
		employeeRepo.save(employee);
	}
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable long id) {
		employeeRepo.deleteById(id);
	}
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable long id) {
		return employeeRepo
				.findById(id)
				.orElseThrow(EmployeeNotFoundException::new);
	}
	@GetMapping("/employee")
	public List<Employee> getEmployee() {
		return (List<Employee>) employeeRepo.findAll();
	}
}
