package com.cognizant.designpattern.abstractfactory;

public abstract class Loan {
    protected double rate=getInterestRate();
	abstract double getInterestRate();

	public double calculateLoanPayment(double loanamount, int years) {

		double EMI;
		int n;
		n = years * 12;
		rate = rate / 1200;
		EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanamount;

		System.out.println("your monthly EMI is " + EMI + " for the amount" + loanamount + " you have borrowed");
	    return EMI;
	}

}
