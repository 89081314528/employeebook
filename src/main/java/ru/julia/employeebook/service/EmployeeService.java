package ru.julia.employeebook.service;

import ru.julia.employeebook.entities.Employee;

public interface EmployeeService {
    String add (String firstName, String lastName, Integer salary, Integer departmentId);
    String remove (String firstName, String lastName);
    Employee find (String firstName, String lastName);

}
