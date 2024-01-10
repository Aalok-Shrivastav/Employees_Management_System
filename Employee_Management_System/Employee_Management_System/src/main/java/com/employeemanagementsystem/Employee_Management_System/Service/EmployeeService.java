package com.employeemanagementsystem.Employee_Management_System.Service;

import com.employeemanagementsystem.Employee_Management_System.Entity.Employee;
import com.employeemanagementsystem.Employee_Management_System.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee()
    {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll();
        return employees;
    }
    public Employee getById(Long id){
        return employeeRepository.findById(id).get();
    }
    public  void Create(Employee employee){
        employeeRepository.save(employee);
    }
    public void delete(Long id){
        employeeRepository.deleteById(id);
    }
    public void update(Employee employee){
        employeeRepository.save(employee);
    }
}
