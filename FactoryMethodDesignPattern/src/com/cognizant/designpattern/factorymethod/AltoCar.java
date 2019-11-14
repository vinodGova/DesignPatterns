package com.cognizant.designpattern.factorymethod;

public class AltoCar extends MaruthiCar {

	 public AltoCar(String engineNo,String color) {
		 super(engineNo,color);
		
	}
	@Override
	public void drive() {
	     System.out.println("Driving Alto Car");
		
	}

}
