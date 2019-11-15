package com.designpatter.withflyweight;

public class PaintAppTestCase {

	public static void render(int noofShapes)
	{
		Ishape shape=null;
		for(int i=0; i<noofShapes;i++)
		{
			if(i<=50)
			{
				shape=ShapFactory.getShape("circle");
				shape.draw(i, "Weight", "Red");
				System.out.println(shape);
			}
			else{
				shape=ShapFactory.getShape("rectangle");
				shape.draw(i+1,i*i,"Green");
				
				System.out.println(shape);
			}
			
		}
		
		
	}
	public static void main(String[] args) {
		render(100);
	}
}
