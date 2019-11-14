package com.decarator.designpattern;

public class CheesPizzaDecarator extends PizzaDecarator{

	public CheesPizzaDecarator(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
   
	
	public void bake()
	{
		super.bake();
		addCheesTopping();
	}
	
	public void addCheesTopping()
	{
		System.out.println("chees topping addded");
	}
}
