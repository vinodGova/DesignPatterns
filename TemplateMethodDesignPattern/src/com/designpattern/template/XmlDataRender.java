package com.designpattern.template;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlDataRender extends DataRender {

	@Override
	public LoanInfo readData() {
		LoanInfo info=null;
		try {
			 info=new LoanInfo();
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=null;
			builder = factory.newDocumentBuilder();
			Document document = builder.parse(getClass().getClassLoader().getResource("loaneligibalform.xml").getFile());
			NodeList list=document.getFirstChild().getChildNodes();
			for(int i=0;i<list.getLength();i++)
			{
				Node node=list.item(i);
				if(node.getNodeName().equalsIgnoreCase("accountholder-name"))
				{
					info.setAccountHolderName(node.getTextContent());
				}
				else if(node.getNodeName().equalsIgnoreCase("age"))
				{
					info.setAge(node.getTextContent());
				}
				else if(node.getNodeName().equalsIgnoreCase("creditcard-score"))
				{
					info.setCreditcardScore(Integer.parseInt(node.getTextContent()));
				}
				
				
			}
			
			
		} catch (SAXException | ParserConfigurationException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return info;
	}

	@Override
	public String processData(LoanInfo data) {
		// TODO Auto-generated method stub
	
		
		 String loanApprovalStatus=null;
		 
		if(((Integer.parseInt(data.getAge()))>=23)&& data.getCreditcardScore()<=2)
		{
		   loanApprovalStatus=data.getAccountHolderName()+" is eleigibale for loan";
		}
		
		return loanApprovalStatus;
	}

}
