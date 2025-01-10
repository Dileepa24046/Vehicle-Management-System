package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate; // Prefer LocalDate over Date
import java.io.Serializable;

@Getter
@Setter
public class VehicleDTO implements Serializable {

    private Long id;
    private String carMake;
    private String carModel;
    private String vin;
    private LocalDate manufacturedDate; // Changed to LocalDate
    private Integer ageOfVehicle; // Changed to Integer for better type specificity
    private Long customerId;  // Foreign key reference to the Customer

}
