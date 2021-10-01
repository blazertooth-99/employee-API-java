package com.crud.employee.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.employee.entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
//	 @Query("select d.id, d.employee from Employee d where d.id=:id")
//	    String findEmployeeById(Long employee_id);
//
//	    @Query("select d.id, d.employee from Employee d")
//	    List<String> findAllEmployee();
//
//	    @Query("select d.id, d.first_name from Employee d")
//	    List<String> findAllFirstName();
//	    
//	    @Query("select d.id, d.last_name from Employee d")
//	    List<String> findAllLastName();
//	    
//	    @Query("select d.id, d.salary from Employee d")
//	    List<String> findAllSalary();
}
