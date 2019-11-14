package com.decarator.designpattern;

public abstract class PizzaDecarator implements Pizza{
	private Pizza pizza;
	
 public PizzaDecarator(Pizza pizza)
 {
	 this.pizza=pizza;
	 
 }

@Override
public void bake() {
	// TODO Auto-generated method stub
	pizza.bake();
}
 
 
}
