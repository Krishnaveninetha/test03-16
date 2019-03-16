package com.test.vehicle.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.test.vehicle1.beans.VehicleDetails;
import com.test.vehicle1.service.RegistraionServiceImpl;
import com.test.vehicle1.service.RegistrationService;

import cm.test.vehicle1.exceptn.RegistrationError;

/**
 * Hello world!
 *
 */
public class App 
{
	static VehicleDetails vd=new VehicleDetails();
	static RegistrationService rs=new RegistraionServiceImpl();
	static String vehicleNo=null;
	static int i=0;
    public static void main( String[] args )
    {
        Scanner s=new Scanner(System.in);
        do {
        System.out.println("enter your choice \n1.regitration \n2. view Details\n 3.exit");
        int choice=s.nextInt();
        switch(choice)
        {
        case 1:
        		System.out.println("enter details to register:");
        		System.out.println("enter vehicle no:");
        		vd.setVehicleNo(s.next());
        		System.out.println("enter vehicle type:");
        		vd.setVehicleType(s.next());
        		System.out.println("enter aadharNo:");
        		vd.setAadharNo(s.next());
        		System.out.println("enter insurance period");
        		vd.setInsurancePeriod(s.nextInt());
        		Date date=new Date();

        		SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyy");
        		
        		vd.setRegisterDate(f.format(date)); 
        	
        	
        		i=rs.registerVehicle(vd);
        		
        		
        		if(i!=0) {
        			System.out.println("vehicle registered");
        			//System.out.println(vd.getRegisterDate()+ " "+vd.getMobileNo());
        		}
        			else
					try {
						throw new RegistrationError();
					} catch (RegistrationError e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        		
        		
        		break;
        case 2:
        	
        	System.out.println("enter vehicleNo: ");
        	vehicleNo=s.next();
        		vd=rs.showDetails(vehicleNo);
        		if(vd!=null) 
        		{
        			System.out.println(vd.getAadharNo());
        		}
        		else
        			System.out.println("error in showing details");
        		break;
        case 3:
        	System.exit(0);
        	break;
        	default: 
        		System.out.println("enter the valid choice");
        		break;
        }
        }while(true);
    }
}
