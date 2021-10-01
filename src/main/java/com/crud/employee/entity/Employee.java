package com.crud.employee.entity;
import lombok.Data;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String salary;
	
	public Employee(Long id, String firstName, String lastName, String salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public Employee() {}
	
	public Long getEmployeeId() {
		return id;
	}
	public void setEmployeeId(Long employee_id) {
		this.id = employee_id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
}
