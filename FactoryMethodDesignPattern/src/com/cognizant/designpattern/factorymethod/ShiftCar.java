package com.cognizant.designpattern.factorymethod;

public class ShiftCar extends MaruthiCar{

	public ShiftCar(String engineNo, String color) {
		super(engineNo, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drive() {
		System.out.println("Driving Shift Car");
		
	}

}
