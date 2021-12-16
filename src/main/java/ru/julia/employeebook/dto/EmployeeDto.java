package ru.julia.employeebook.dto;

import javax.persistence.Column;
import java.util.UUID;

public class EmployeeDto {
    private UUID employeeId = UUID.randomUUID();
    private final String firstName;
    private final String lastName;
    private final Integer salary;
    private final Integer departmentId;

    public EmployeeDto(String firstName, String lastName, Integer salary, Integer departmentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.departmentId = departmentId;
    }
}
