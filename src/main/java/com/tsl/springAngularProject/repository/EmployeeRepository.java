package com.tsl.springAngularProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsl.springAngularProject.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
