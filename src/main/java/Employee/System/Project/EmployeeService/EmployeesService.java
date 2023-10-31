package Employee.System.Project.EmployeeService;

import Employee.System.Project.EmployeeEntity.Employee;
import Employee.System.Project.EmployeeRepository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeesService {

    @Autowired
    EmployeesRepository employeesRepository;

    public Employee saveEmployee(Employee employee){
        return employeesRepository.save(employee);
    }

    public List<Employee> getAllEmployee()
    {
        return employeesRepository.findAll();
    }
    public Employee getById(Long id){
        return employeesRepository.findById(id).get();
    }

    public void delete(Long id){
        employeesRepository.deleteById(id);
    }
    public void update(Employee employee){
        employeesRepository.save(employee);
    }
}
