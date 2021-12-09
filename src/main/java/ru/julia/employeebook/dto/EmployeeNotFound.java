package ru.julia.employeebook.dto;

import liquibase.pro.packaged.E;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.julia.employeebook.entities.Employee;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFound extends RuntimeException{
}
