package com.designpattern.template;

import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDataRender extends DataRender{

	@Override
	public LoanInfo readData() {
	     Properties props=new Properties();
	     try {
			props.load(this.getClass().getClassLoader().getResourceAsStream("loaneligibalform.properties"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     LoanInfo info=new LoanInfo();
	     info.setAccountHolderName(props.getProperty("accountholder-name"));
	     info.setAge(props.getProperty("age"));
	     info.setCreditcardScore(Integer.parseInt(props.getProperty("creditcardscore")));
		return info;
	}

	@Override
	public String processData(LoanInfo data) {
		// TODO Auto-generated method st
		
		String loanApprovalStatus=null;
		
		if(Integer.parseInt(data.getAge())<40)
		{
		loanApprovalStatus=data.getAccountHolderName()+" is eleigibale for loan";
			
		}
		return loanApprovalStatus;
	}

}
