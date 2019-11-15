package com.designpattern.withoutflyweight;

public class Rectangle implements Ishape{

	
	private String lable;
	private int width;
	private int breath;
	private String fillStyle;
	
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		lable="Recatangle";
	}
	
	
	public String getLable() {
		return lable;
	}


	public void setLable(String lable) {
		this.lable = lable;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int i) {
		this.width = i;
	}


	public int getBreath() {
		return breath;
	}


	public void setBreath(int breath) {
		this.breath = breath;
	}


	public String getFillStyle() {
		return fillStyle;
	}


	public void setFillStyle(String fillStyle) {
		this.fillStyle = fillStyle;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing "+lable+"Width"+getWidth()+"fillStyle"+getFillStyle());
	}
	
	

}
