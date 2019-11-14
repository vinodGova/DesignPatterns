package com.designpattern.template.testcases;


import com.designpattern.template.PropertiesFileDataRender;
import com.designpattern.template.XmlDataRender;

public class TemplateMethodTestCases {
public static void main(String[] args) {
	/*XmlDataRender datarender=new XmlDataRender();
	datarender.render();*/
	
	PropertiesFileDataRender dataRender=new PropertiesFileDataRender();
	dataRender.render();
	
}
}
