package ru.julia.employeebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.julia.employeebook.entities.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> getByFirstNameAndLastName(String firstName, String lastName);
}
