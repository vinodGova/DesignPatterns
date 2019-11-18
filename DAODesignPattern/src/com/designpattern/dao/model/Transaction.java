package com.designpattern.dao.model;

public class Transaction {

	
	public Transaction(String tinNo, String accountNo) {
		super();
		this.tinNo = tinNo;
		this.accountNo = accountNo;
	}
	String tinNo;
	String accountNo;
	public String getTinNo() {
		return tinNo;
	}
	public void setTinNo(String tinNo) {
		this.tinNo = tinNo;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	
}
