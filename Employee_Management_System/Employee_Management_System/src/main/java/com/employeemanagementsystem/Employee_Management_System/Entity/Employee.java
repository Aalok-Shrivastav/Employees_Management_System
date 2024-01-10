package com.employeemanagementsystem.Employee_Management_System.Entity;



import javax.persistence.*;


@Entity
@Table(name = "employees")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long id;

    @Column(name="First_Name")
    private String First_Name;

    @Column(name = "Last_Name")
    private String Last_Name;
    @Column(name ="Email_ID")
    private String Email_ID;
    @Column(name = "Salary")
    private Long Salary;

    public Employee() {
    }

    public Employee(String first_Name, String last_Name, String email_ID, Long salary) {
        First_Name = first_Name;
        Last_Name = last_Name;
        Email_ID = email_ID;
        Salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.Last_Name = last_Name;
    }

    public String getEmail_ID() {
        return Email_ID;
    }

    public void setEmail_ID(String email_ID) {
        this.Email_ID = email_ID;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setSalary(Long salary) {
        this.Salary = salary;
    }
}
