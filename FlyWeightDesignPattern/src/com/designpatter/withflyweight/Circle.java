package com.designpatter.withflyweight;

public class Circle extends Ishape{

	private String lable;
	
	public Circle() {
		lable="Circle";
	}

	@Override
	public void draw(int radius, String fillColor, String lineColor) {
		// TODO Auto-generated method stub
		System.out.println("drawing "+lable+"With Radios"+radius+"fillColor"+fillColor);
	}
	
	
	
}
