package Employee.System.Project.EmployeeEntity;

import javax.persistence.*;

@Entity
@Table(name = "EmployeeData")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private long Id;
    @Column(name ="Email_Id" )
    private String Email_Id;
    @Column(name = "First_Name")
    private String First_Name;
    @Column(name = "Last_Name")
    private String Last_Name;
    @Column(name = "Department")
    private String Department;

    @Column(name = "Salary")
    private long Salary;

    public Employee() {
    }

    public Employee(String email_Id, String first_Name, String last_Name, String department, long salary) {
        Email_Id = email_Id;
        First_Name = first_Name;
        Last_Name = last_Name;
        Department = department;
        Salary = salary;
    }

    public String getEmail_Id() {
        return Email_Id;
    }

    public void setEmail_Id(String email_Id) {
        Email_Id = email_Id;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public long getSalary() {
        return Salary;
    }

    public void setSalary(long salary) {
        Salary = salary;
    }
}
