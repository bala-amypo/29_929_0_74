package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Location {
    
    @Id
    private Long id;
    private String name;
    private double latitude;
    private double longitude;
}
