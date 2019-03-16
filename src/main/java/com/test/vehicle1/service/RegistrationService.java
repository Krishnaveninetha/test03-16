package com.test.vehicle1.service;

import com.test.vehicle1.beans.VehicleDetails;

public interface RegistrationService {
	
	int registerVehicle(VehicleDetails vd);
	VehicleDetails showDetails(String vehicleNo);
	
	

}
