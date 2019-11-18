package com.designpattern.dao;

import java.util.ArrayList;
import java.util.List;

import com.designpattern.dao.model.Transaction;
import com.designpattern.dao.model.TransactionBo;

public class TransactionDaoImpl implements TransactionDao {

	List<Transaction>transactions;
	
	public TransactionDaoImpl() {
		// TODO Auto-generated constructor stub
		
	 transactions=new ArrayList<>();
	 transactions.add(new Transaction("2345644","345687655555"));
	 transactions.add(new Transaction("1123456","378654390055"));
	 
	}
	
	@Override
	public List<Transaction> getAllTransactions() {
		// TODO Auto-generated method stub
		
		return transactions;
	}

	@Override
	public Transaction getTransactionByTinNo(int tin) {
		// TODO Auto-generated method stub
		return transactions.get(tin);
	}

	@Override
	public void saveTransaction(Transaction transaction) {
		
		transactions.add(transaction);
	}

	@Override
	public void DeleteTransaction(TransactionBo transaction) {
		// TODO Auto-generated method stub
		transactions.remove(transaction);
		
	}

}
