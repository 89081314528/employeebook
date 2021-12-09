package ru.julia.employeebook.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.julia.employeebook.dto.EmployeeNotFound;
import ru.julia.employeebook.entities.Employee;
import ru.julia.employeebook.repositories.EmployeeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public String add(String firstName, String lastName, Integer salary, Integer departmentId) {
        Employee employee = new Employee(firstName, lastName, salary, departmentId);
        employeeRepository.save(employee);
        return "Сотрудник " + firstName + " " + lastName + " успешно создан";
    }

    @Override
    public String remove(String firstName, String lastName) {
        List<Employee> employeeList = employeeRepository.getByFirstNameAndLastName(firstName, lastName);
        if (employeeList.isEmpty()) {
            throw new EmployeeNotFound();
        }
        Employee employee = employeeList.get(0);
        employeeRepository.delete(employee);
        return "Сотрудник " + firstName + " " + lastName + " удален";
    }

    @Override
    public Employee find(String firstName, String lastName) {
        List<Employee> employeeList = employeeRepository.getByFirstNameAndLastName(firstName, lastName);
        if (employeeList.isEmpty()) {
            throw new EmployeeNotFound();
        }
        Employee employee = employeeList.get(0);
        return employee;
    }
}
