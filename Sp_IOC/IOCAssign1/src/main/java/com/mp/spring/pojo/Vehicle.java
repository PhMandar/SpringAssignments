package com.mp.spring.pojo;

public class Vehicle {
	private String vehicleType; /*car, truck, bike*/
	private int wheels;
	private int seats; /*2, 4*/
	private int windows;
	private TmpPojo tmpObj;
	
	public Vehicle() {
		this("", -1, -1, -1, null);
	}
	
	public Vehicle(String pVehicleType, int wheels, int seats, int windows, TmpPojo pTmpObj) {
		this.vehicleType = pVehicleType;
		this.wheels = wheels;
		this.seats = seats;
		this.windows = windows;
		this.tmpObj = pTmpObj;
	}

	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getWindows() {
		return windows;
	}
	public void setWindows(int windows) {
		this.windows = windows;
	}
	
	public TmpPojo getTmpObj() {
		return tmpObj;
	}
	
	public void setTmpObj(TmpPojo tmpObj) {
		this.tmpObj = tmpObj;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleType=" + vehicleType + ", wheels=" + wheels + ", seats=" + seats + ", windows="
				+ windows + ", tmpObj=" + tmpObj + "]";
	}
}
