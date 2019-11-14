package com.designpattern.template;

public abstract class DataRender {

	
	//Algorithm is fixed
	public void render()
	{
		LoanInfo data=readData();
		String response=processData(data);
		System.out.println(response);
		
	}
	public abstract LoanInfo readData();
	public abstract String processData(LoanInfo data);
	
}
