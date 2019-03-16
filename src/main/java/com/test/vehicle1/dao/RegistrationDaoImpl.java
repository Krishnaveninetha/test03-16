package com.test.vehicle1.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.test.vehicle1.beans.VehicleDetails;

public class RegistrationDaoImpl implements RegistrationDao {
VehicleDetails vd=new VehicleDetails();
static Map<String,VehicleDetails> mp=new HashMap<String,VehicleDetails>();
int i=0;
	public int regiterVehicle(VehicleDetails vd) {
		// TODO Auto-generated method stub
		
		mp.put(vd.getVehicleNo(), new VehicleDetails(vd.getAadharNo(),vd.getInsurancePeriod(),vd.getMobileNo(),vd.getVehicleType(),vd.getRegisterDate()));
	i++;
	
		if(i!=0)
		 return 1;
		else 
		return 0;
	}

	public VehicleDetails showDetails(String vehicleNo) {
		// TODO Auto-generated method stub
		int c=0;
		for(Map.Entry<String, VehicleDetails> me:mp.entrySet())
		{
			
			if(me.getKey().equals(vehicleNo))
			{
				
				
				vd.setVehicleNo(me.getKey());
				vd=me.getValue();
				vd.setDueDays(me.getValue().getRegisterDate());
				c++;
				
			}
			
		}
		if(c!=0)
		return vd;
		else 
			return null;
	}
	
	

}
