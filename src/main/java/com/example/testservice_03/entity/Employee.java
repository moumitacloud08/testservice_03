package com.example.testservice_03.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

    public Employee() {
    }
}
