package ru.julia.employeebook.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "emps")
@Data
public class Employee {
//    private static int nextId = 1;
    @Column(name = "emp_id")
    @Id
//    private Integer employeeId = assignId();
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    private UUID employeeId = UUID.randomUUID();
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "salary")
    private Integer salary;
    @Column(name = "dept_id")
    private Integer departmentId;

//    private static int assignId() {
//        int r = nextId;
//        nextId++;
//        return r;
//    }

    public Employee(String firstName, String lastName, Integer salary, Integer departmentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.departmentId = departmentId;
    }
    public Employee(){};

    public String toString() {
        return firstName + " " + lastName + " " + salary + " " + departmentId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Employee emp = (Employee) obj;
        return employeeId == emp.employeeId
                && (firstName == emp.firstName || (firstName != null && firstName.equals(emp.getFirstName())))
                && (salary == emp.salary || (salary != null && salary.equals(emp.getSalary())))
                && (departmentId == emp.departmentId || (departmentId != null && departmentId.equals(emp.getDepartmentId())))
                && (lastName == emp.lastName || (lastName != null && lastName .equals(emp.getLastName())
        ));
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
//        result = prime * result + employeeId; ???????????
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((salary == null) ? 0 : salary.hashCode());
        result = prime * result + ((departmentId == null) ? 0 : departmentId.hashCode());
        return result;
    }
}
