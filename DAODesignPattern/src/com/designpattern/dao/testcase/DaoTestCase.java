package com.designpattern.dao.testcase;

import com.designpattern.dao.TransactionDao;
import com.designpattern.dao.TransactionDaoImpl;

public class DaoTestCase {

	public static void main(String[] args) {
		
		TransactionDao transaction=new TransactionDaoImpl();
		System.out.println(transaction.getAllTransactions());
		
	}
}
