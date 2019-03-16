package com.test.vehicle1.beans;

public class VehicleDetails {
	private String vehicleNo;
	private String aadharNo;
	private String mobileNo;
	private int insurancePeriod;
	private String vehicleType;
	private String dueDays;
	private String registerDate;
	
	public VehicleDetails(String aadharNo2, int insurancePeriod2, String mobileNo2, String vehicleType2,String registerDate2) {
		// TODO Auto-generated constructor stub
		this.vehicleType=vehicleType2;
		this.insurancePeriod=insurancePeriod2;
		this.mobileNo=mobileNo2;
		this.aadharNo=aadharNo2;
		this.registerDate=registerDate2;
		
	}
	
	public VehicleDetails() {
		// TODO Auto-generated constructor stub
	}

	public String getVehicleNo() {
		return vehicleNo;
	}
	public String setVehicleNo(String vehicleNo) {
		return this.vehicleNo = vehicleNo;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getInsurancePeriod() {
		return insurancePeriod;
	}
	public void setInsurancePeriod(int insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public String getDueDays() {
		return dueDays;
	}
	public void setDueDays(String dueDay1) {
		this.dueDays = dueDay1;
	}
	public void setRegisterDate(String registerDate1) {
		this.registerDate = registerDate1;
	}
	
	

}
