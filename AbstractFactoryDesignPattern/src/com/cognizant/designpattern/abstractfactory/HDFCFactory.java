package com.cognizant.designpattern.abstractfactory;

public class HDFCFactory extends BankProviderFactory {

	@Override
	protected Bank newBank() {
		// TODO Auto-generated method stub
		return new HDFC();
	}

	@Override
	protected Loan newLoan() {
		// TODO Auto-generated method stub
		return new HDFCHomeLoan();
	}

}
