package com.cognizant.designpattern.abstractfactory;

public class BankProvidersFactoryFactory {
	BankProviderFactory providerFactory;
	
	public BankProviderFactory newInstance(String provider)
	{
		if(provider.equalsIgnoreCase("capitalone"))
		{
			providerFactory=new CapitaloneFactory();
		}
		
		if(provider.equalsIgnoreCase("HDFC"))
		{
			providerFactory=new HDFCFactory();
		}
		
		return providerFactory;
	}
}
