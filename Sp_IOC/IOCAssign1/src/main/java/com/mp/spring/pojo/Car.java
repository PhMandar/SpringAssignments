package com.mp.spring.pojo;

public class Car {
	private String name; /*Maruti Suzuki, Skoda Activa, Datsun Go, Mahindra Thar, Volvo S60, Audi R8, Mercedes AMG*/
	private String model; /* Hatchback, Sedan, MPV, SUV, Crossover, Coupe, Convertible*/
	private String type; /*Sports, People Carrying */
	private Vehicle vehicle;
	
	
	public Car() {
		this("","", "", null);
	}
	
	public Car(String pName, String pModel, String pType, Vehicle pVehicle) {
		this.name = pName;
		this.model = pModel;
		this.type = pType;
		this.vehicle = pVehicle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", type=" + type + " vehicle = " + vehicle + "]";
	}
}
