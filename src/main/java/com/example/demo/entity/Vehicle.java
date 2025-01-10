package com.example.demo.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String carmake;

    private String carmodel;

    private String vin;

    private LocalDate manufactureddate; // Changed to java.time.LocalDate

    private Integer ageofVehicle;

    @ManyToOne
    @JoinColumn(name = "customer_id") // Foreign key column
    @JsonBackReference
    private Customer customer;

    public int getAge() {
        return LocalDate.now().getYear() - manufactureddate.getYear();
    }
}
