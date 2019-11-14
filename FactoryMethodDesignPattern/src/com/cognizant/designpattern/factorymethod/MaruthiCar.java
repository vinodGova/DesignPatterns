package com.cognizant.designpattern.factorymethod;

public abstract class MaruthiCar {
  String engineNo;
  String Color;
  
  public MaruthiCar(String engineNo,String color)
  {
	  this.engineNo=engineNo;
	  this.Color=color;
  }
  
  
  public String getEngineNo() {
	return engineNo;
}


public void setEngineNo(String engineNo) {
	this.engineNo = engineNo;
}


public String getColor() {
	return Color;
}


public void setColor(String color) {
	Color = color;
}


public abstract void drive();
}
