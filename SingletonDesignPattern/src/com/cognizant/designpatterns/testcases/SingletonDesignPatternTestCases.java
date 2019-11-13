package com.cognizant.designpatterns.testcases;

import com.cognizant.designpatterns.SQLConnectionUtil;

public class SingletonDesignPatternTestCases {

	public static void main(String[] args) {
		
		//If we call creatConnection()method multiple times also it returns same Instance(Object) and check below output.
		SQLConnectionUtil utility1=SQLConnectionUtil.creatConnection();
		SQLConnectionUtil utility2=SQLConnectionUtil.creatConnection();
		
		System.out.println(utility1);
		System.out.println(utility2);
		
		System.out.println(utility1==utility2);
		
		
		
		/*  Out PUT
		 * com.cognizant.designpatterns.SQLConnectionUtil@135fbaa4
		 * com.cognizant.designpatterns.SQLConnectionUtil@135fbaa4
		 * true
		 * 
		 * 
		 * 
		 * 
		 */
	}
	
}
