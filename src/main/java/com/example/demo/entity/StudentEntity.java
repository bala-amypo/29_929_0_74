package com.example.demo.entity;

import jakarta.persistence.Entity;

@Entity
@Table()
public class StudentEntity {


    private Long id;
    private String name;
    private String email;
    private float cgpa;
}
