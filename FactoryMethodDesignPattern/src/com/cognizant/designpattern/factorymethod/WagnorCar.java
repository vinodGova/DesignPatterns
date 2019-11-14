package com.cognizant.designpattern.factorymethod;

public class WagnorCar extends MaruthiCar{

	public WagnorCar(String engineNo, String color) {
		super(engineNo, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drive() {
		System.out.println("Driving Wagnar Car");
		
	}

}
