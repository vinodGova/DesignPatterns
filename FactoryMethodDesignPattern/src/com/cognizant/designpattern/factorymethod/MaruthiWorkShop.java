package com.cognizant.designpattern.factorymethod;

public abstract class MaruthiWorkShop {
	public MaruthiCar assembly(String type)
	{
		MaruthiCar car=null;
		car=createCar(type);
		//assebling the car
		System.out.println(type+"car Created");
		System.out.println("attached weels");
		System.out.println("fit seats");
		System.out.println("asseble the engine");
		return car;
		
	}

	
	abstract MaruthiCar createCar(String type);
}
