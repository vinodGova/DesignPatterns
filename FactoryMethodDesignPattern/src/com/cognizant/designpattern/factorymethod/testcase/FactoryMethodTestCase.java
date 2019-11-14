package com.cognizant.designpattern.factorymethod.testcase;

import com.cognizant.designpattern.factorymethod.AltoPuneWorkShop;

public class FactoryMethodTestCase {

	public static void main(String[] args) {
		AltoPuneWorkShop shop=new AltoPuneWorkShop();
		shop.assembly("alto");
	}
}
