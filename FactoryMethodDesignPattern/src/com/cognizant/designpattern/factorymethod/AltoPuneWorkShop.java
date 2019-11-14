package com.cognizant.designpattern.factorymethod;

public class AltoPuneWorkShop extends MaruthiWorkShop{

	@Override
	MaruthiCar createCar(String type) {
		// TODO Auto-generated method stub
		return new AltoCar("trtengine","red");
	}

}
