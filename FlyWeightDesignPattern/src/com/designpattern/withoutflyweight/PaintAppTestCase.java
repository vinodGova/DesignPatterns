package com.designpattern.withoutflyweight;

import java.util.Scanner;

public class PaintAppTestCase {

	// I want to 100 circles and Rectangles.here the problem is unnessarly creating huge objects ant it causes to memory problems so to avoid this problem go for flyweight designpattern
	public static void render(int noofShapes) {
		Ishape[] shapes = new Ishape[noofShapes + 1];
		for (int i = 0; i <= noofShapes; i++) {
			if (i >= 50) {
				shapes[i] = new Circle();
				((Circle) shapes[i]).setFillColor("RED");
				((Circle) shapes[i]).setRadius(i);
				((Circle) shapes[i]).setLineColor("white");

				shapes[i].draw();

			} else {
				shapes[i] = new Rectangle();
				((Rectangle) shapes[i]).setWidth(i + 2);
				((Rectangle) shapes[i]).setBreath(i * i);
				((Rectangle)shapes[i]).setFillStyle("Blue");
				shapes[i].draw();
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the noof shapes u want");
		int noofShapes=sc.nextInt();
	    render(noofShapes);	
	}
}
