package com.java.eight;

public class LambdaExpressionExample{

	public static void main(String[] args) {
		Bank b=(p)->{System.out.println("account No"+p);};
		b.getAmount("677888888");
	}
	
	
}
