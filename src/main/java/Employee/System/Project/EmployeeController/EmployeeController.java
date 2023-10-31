package Employee.System.Project.EmployeeController;

import Employee.System.Project.EmployeeEntity.Employee;
import Employee.System.Project.EmployeeService.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeesService employeesService;

    @PostMapping("/newemployee")
    public Employee saveEmployee(@RequestBody Employee employee){

        return employeesService.saveEmployee(employee);
    }
    @GetMapping("/employees")
    private List<Employee> getAllEmployee(){
        return employeesService.getAllEmployee();
    }
    @GetMapping("/employees/{id}")
    private Employee getEmployee(@PathVariable("id")long id) {
        return employeesService.getById(id);
    }

    @DeleteMapping("/employee/{id}")
    private void delete(@PathVariable("id")Long id)
    {
        employeesService.delete(id);
    }

    @PutMapping
    private Employee update(@RequestBody Employee employee)
    {
        employeesService.update(employee);
        return employee;
    }
}
