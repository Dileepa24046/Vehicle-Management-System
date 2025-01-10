package com.example.demo.service;

import com.example.demo.entity.Vehicle;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface VehicleService {

    // Import vehicles from an uploaded file
    void parseAndSaveVehicles(MultipartFile file) throws Exception;

    // Queue a file for batch processing
    void queueFileForBatchProcessing(MultipartFile file) throws Exception;

    // Export vehicles to a CSV file based on criteria (e.g., age)
    Resource exportVehicles(Integer age);

    // Create a new vehicle
    Vehicle createVehicle(Vehicle vehicle);

    // Update an existing vehicle by ID
    Vehicle updateVehicle(Long id, Vehicle vehicle);

    // Delete a vehicle by ID
    void deleteVehicle(Long id);

    // List vehicles with pagination
    Page<Vehicle> listVehicles(int page, int size);

    // Search vehicles by car model
    List<Vehicle> searchVehiclesByCarModel(String carModel);

    // List all vehicles as an array
    List<Vehicle> listAllVehicles();
}