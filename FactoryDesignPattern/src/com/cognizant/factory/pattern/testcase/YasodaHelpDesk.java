package com.cognizant.factory.pattern.testcase;



import com.cognizant.factory.pattern.ServiceFactory;
import com.cognizant.factory.pattern.Services;

public class YasodaHelpDesk {

	public static void submitAutharization(String operationName,String healthCardNo) 
	{
		Services service=ServiceFactory.newService("uhg");
		service.approval(operationName, healthCardNo);
	}
	
	public static void main(String[] args) {
		submitAutharization("HeartOperation", "456y87238");
	}
	
	}
