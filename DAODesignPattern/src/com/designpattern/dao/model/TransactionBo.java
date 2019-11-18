package com.designpattern.dao.model;

public class TransactionBo {

	String AccountHolderName;
	String date;
	String cashInamount;
	String accountNo;
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCashInamount() {
		return cashInamount;
	}
	public void setCashInamount(String cashInamount) {
		this.cashInamount = cashInamount;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
}
