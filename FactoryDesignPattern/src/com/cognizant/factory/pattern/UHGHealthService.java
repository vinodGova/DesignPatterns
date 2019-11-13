package com.cognizant.factory.pattern;

public class UHGHealthService extends CommanAbstract{

	public UHGHealthService(String hospitalNo, String hospitalName, String partnerCode) {
		super(hospitalNo, hospitalName, partnerCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void approval(String OperationName, String healthCardNo) {
		System.out.println("Approval completed by UGH---------"+getHospitalName());
		
	}

}
