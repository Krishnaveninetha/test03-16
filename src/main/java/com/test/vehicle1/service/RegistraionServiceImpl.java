package com.test.vehicle1.service;

import java.util.Map;

import com.test.vehicle1.beans.VehicleDetails;
import com.test.vehicle1.dao.RegistrationDao;
import com.test.vehicle1.dao.RegistrationDaoImpl;

public class RegistraionServiceImpl implements RegistrationService {
VehicleDetails vd=new VehicleDetails();
RegistrationDao rd=new RegistrationDaoImpl();

	
public int registerVehicle(VehicleDetails vd) {
	// TODO Auto-generated method stub
	
int i=rd.regiterVehicle(vd);
	return i;
}

	public VehicleDetails showDetails(String vehicleNo) {
		// TODO Auto-generated method stub
	
		vd=rd.showDetails(vehicleNo);
		
		return vd;
	}

	
	
}
