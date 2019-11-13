package com.cognizant.factory.pattern;

public abstract class CommanAbstract implements Services {

	private String hospitalNo;
	private String hospitalName;
	private String partnerCode;
	public CommanAbstract(String hospitalNo, String hospitalName, String partnerCode) {
		super();
		this.hospitalNo = hospitalNo;
		this.hospitalName = hospitalName;
		this.partnerCode = partnerCode;
	}
	public String getHospitalNo() {
		return hospitalNo;
	}
	public void setHospitalNo(String hospitalNo) {
		this.hospitalNo = hospitalNo;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getPartnerCode() {
		return partnerCode;
	}
	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}
	
	
	
	
}
