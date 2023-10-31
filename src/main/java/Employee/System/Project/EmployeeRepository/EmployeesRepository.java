package Employee.System.Project.EmployeeRepository;

import Employee.System.Project.EmployeeEntity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeesRepository extends JpaRepository<Employee,Long> {

}
