package com.decarator.designpattern.testcases;

import com.decarator.designpattern.CheesPizzaDecarator;
import com.decarator.designpattern.NormalPizza;
import com.decarator.designpattern.PizzaDecarator;
import com.decarator.designpattern.TomotoPizzaDecarator;

public class DecaratorPatternTestCase {

	public static void main(String[] args) {
		
		/*PizzaDecarator decarator=new TomotoPizzaDecarator(new NormalPizza());
		decarator.bake();*/
		
		PizzaDecarator decarator1=new CheesPizzaDecarator(new NormalPizza());
		decarator1.bake();
	}
}
