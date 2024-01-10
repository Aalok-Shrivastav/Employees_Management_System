package com.employeemanagementsystem.Employee_Management_System.Repository;


import com.employeemanagementsystem.Employee_Management_System.Entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
