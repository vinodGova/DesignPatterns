package com.cognizant.designpattern.abstractfactory;

public abstract class BankProviderFactory {

	public Bank newInstances()
	{
		return newBank();
	}
	
	public Loan loanInstances()
	{
		return newLoan();
	}
	
	protected abstract Bank newBank();
	protected abstract Loan newLoan();
}
