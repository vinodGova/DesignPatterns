package com.decarator.designpattern;

public class TomotoPizzaDecarator extends PizzaDecarator{

	public TomotoPizzaDecarator(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	
	public void bake()
	{
		super.bake();
		addTomotoTopping();
		
	} 
	
	public void addTomotoTopping()
	{
		System.out.println("Tomoto topping addded");
	}
}
