package com.test.vehicle1.dao;

import java.util.Map;

import com.test.vehicle1.beans.VehicleDetails;

public interface RegistrationDao {
	int regiterVehicle(VehicleDetails vd);
	VehicleDetails showDetails(String vehicleNo);
	

}
