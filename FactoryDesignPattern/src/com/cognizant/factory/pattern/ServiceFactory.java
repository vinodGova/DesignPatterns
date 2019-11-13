package com.cognizant.factory.pattern;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ServiceFactory {

	public static Services newService(String providerName)  
	{
		
		Properties props=new Properties();
		Services service=null;
		try {
			
		props.load(ServiceFactory.class.getClassLoader().getResourceAsStream("yasodaHospitalDetails.properties"));
		

		
		}catch(IOException e){
			System.out.println(e);
		}
		
		
		if(providerName.equalsIgnoreCase("athna"))
			service=new AthnaHealthService(props.getProperty("hospitalNo"),props.getProperty("hospitalName"),props.getProperty("partnerNo"));
					
		if(providerName.equalsIgnoreCase("uhg"))
			service=new UHGHealthService(props.getProperty("hospitalNo"),props.getProperty("hospitalName"),props.getProperty("partnerNo"));
		return service;
	}
}
