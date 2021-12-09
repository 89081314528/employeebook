package ru.julia.employeebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.julia.employeebook.entities.Department;

public interface DepartmentRepository extends JpaRepository <Department, Integer> {
}
