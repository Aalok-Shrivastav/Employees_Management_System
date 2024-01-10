package com.employeemanagementsystem.Employee_Management_System.Controller;


import com.employeemanagementsystem.Employee_Management_System.Entity.Employee;
import com.employeemanagementsystem.Employee_Management_System.Service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    private List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @GetMapping("/employees/{id}")
    private Employee getEmployee(@PathVariable("id")long id) {
        return employeeService.getById(id);
    }

    @PostMapping("/employeepost")
    private String create(@RequestBody Employee employee)
    {
        System.out.println(employee.getFirst_Name());
        employeeService.Create(employee);
        return "Posted Successfully";
    }
    @DeleteMapping("/employee/{id}")
    private Employee delete(@PathVariable("id")Long id)
    {
        employeeService.delete(id);
        return null;
    }

    @PutMapping
    private Employee update(@RequestBody Employee employee)
    {
        employeeService.update(employee);
        return employee;
    }
    

}
