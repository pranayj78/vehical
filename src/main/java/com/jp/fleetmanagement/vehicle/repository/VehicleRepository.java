/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.fleetmanagement.vehicle.repository;

import com.jp.fleetmanagement.vehicle.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author prjoshi
 */

public interface VehicleRepository extends JpaRepository<Vehicle, String>{
    
}
