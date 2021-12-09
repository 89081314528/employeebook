package ru.julia.employeebook.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "depts")
@Data
public class Department {
    @Column(name = "dept_id")
    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    private UUID departmentId = UUID.randomUUID();
    @Column(name = "dept_name")
    private String departmentName;
}
