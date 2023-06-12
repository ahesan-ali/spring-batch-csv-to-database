package com.howtodoinjava.demo.repository;

import com.howtodoinjava.demo.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}



