package com.designpatter.withflyweight;

public class Rectangle extends Ishape{

	String lable;
	
	public Rectangle()
	{
		lable="Rectangle";
	}
	@Override
	public void draw(int length, int breadth, String fillStyle) {
		// TODO Auto-generated method stub
		System.out.println("drawing "+lable+"With length"+length+"fillstyle");
	}

	
}
