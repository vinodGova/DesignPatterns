package com.cognizant.designpattern.abstractFactory.testcases;

import java.util.Scanner;

import com.cognizant.designpattern.abstractfactory.BankProviderFactory;
import com.cognizant.designpattern.abstractfactory.BankProvidersFactoryFactory;

public class AbstractFactoryTest {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Bank");
		String providerName=sc.next();
		
		System.out.println("Enter Loan Amount");
		double loanamount=sc.nextDouble();
		
		System.out.println("Enter no of years");
		
		int years =sc.nextInt();
		
		BankProvidersFactoryFactory factoryFactory=new BankProvidersFactoryFactory();
		BankProviderFactory providerFactory=factoryFactory.newInstance(providerName);
		System.out.println("Bank Name"+providerFactory.newInstances().getBankName());
		System.out.println("EMI Cost of"+providerFactory.newInstances().getBankName()+""+providerFactory.loanInstances().calculateLoanPayment(loanamount, years));
		
	}
}
