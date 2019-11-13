package com.cognizant.designpattern.abstractfactory;

public class CapitaloneFactory extends BankProviderFactory {

	@Override
	protected Bank newBank() {
		// TODO Auto-generated method stub
		return new Capitalone();
	}

	@Override
	protected Loan newLoan() {
		// TODO Auto-generated method stub
		return new CapitaloneHomeLoan();
	}

}
