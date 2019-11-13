package com.cognizant.factory.pattern;

public class AthnaHealthService extends CommanAbstract{

	public AthnaHealthService(String hospitalNo, String hospitalName, String partnerCode) {
		super(hospitalNo, hospitalName, partnerCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void approval(String OperationName, String healthCardNo) {
		System.out.println("Approval Sucess by Athna"+getHospitalName());
		
	}

}
