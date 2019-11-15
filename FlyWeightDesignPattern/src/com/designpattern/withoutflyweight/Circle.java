package com.designpattern.withoutflyweight;

public class Circle implements Ishape{

	private String label;
	private int radius;
	private String fillColor;
	private String lineColor;
	
	
	public Circle()
	{
		label="Circle";
		
	}
	
	
	
	public String getLabel() {
		return label;
	}



	public void setLabel(String label) {
		this.label = label;
	}



	public int getRadius() {
		return radius;
	}



	public void setRadius(int radius) {
		this.radius = radius;
	}



	public String getFillColor() {
		return fillColor;
	}



	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}



	public String getLineColor() {
		return lineColor;
	}



	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}



	@Override
	public void draw() {
		
		System.out.println("drawing "+label+"With Radios"+getRadius()+"fillColor"+getFillColor());
	}

}
