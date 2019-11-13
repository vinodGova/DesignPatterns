package com.cognizant.designpattern.abstractfactory;

public class Capitalone implements Bank {
	private final String BNAME; 
	
	 public Capitalone() {
		// TODO Auto-generated constructor stub
	
        BNAME="CapitalOne";  
}  
	@Override
	public String getBankName() {
		
		return BNAME;
	}

}
