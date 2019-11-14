package com.cognizant.designpattern.factorymethod;

public class ShiftGujaratWorkShop extends MaruthiWorkShop{

	@Override
	MaruthiCar createCar(String type) {
		// TODO Auto-generated method stub
		
		return new ShiftCar("shiftengine","blue");
		
	}

}
