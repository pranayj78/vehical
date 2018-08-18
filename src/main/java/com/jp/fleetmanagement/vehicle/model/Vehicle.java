/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.fleetmanagement.vehicle.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author prjoshi
 */
@Entity
public class Vehicle implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "registrationNumber", columnDefinition = "VARCHAR(30)")
    private String registrationNumber;

    @Column(name = "make", columnDefinition = "VARCHAR(30)")
    private String make;
    @Column(name = "model", columnDefinition = "VARCHAR(255)")
    private String model;
    @Column(name = "vin", columnDefinition = "VARCHAR(16)")
    private String vin;
    @Column(name = "engienNumber", columnDefinition = "VARCHAR(16)")
    private String engienNumber;
    @Column(name = "countryOfRegistration", columnDefinition = "VARCHAR(3)")
    private String countryOfRegistration;
    
    @OneToMany(mappedBy = "vehicle")
    private List<FuelTracker> fuelTrackers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryOfRegistration() {
        return countryOfRegistration;
    }

    public void setCountryOfRegistration(String countryOfRegistration) {
        this.countryOfRegistration = countryOfRegistration;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getEngienNumber() {
        return engienNumber;
    }

    public void setEngienNumber(String engienNumber) {
        this.engienNumber = engienNumber;
    }

    public List<FuelTracker> getFuelTrackers() {
        return fuelTrackers;
    }

    public void setFuelTrackers(List<FuelTracker> fuelTrackers) {
        this.fuelTrackers = fuelTrackers;
    }

}
