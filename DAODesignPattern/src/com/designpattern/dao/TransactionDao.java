package com.designpattern.dao;

import java.util.List;

import com.designpattern.dao.model.Transaction;
import com.designpattern.dao.model.TransactionBo;

public interface TransactionDao {

	List<Transaction>getAllTransactions();
    Transaction getTransactionByTinNo(int tin);
    void saveTransaction(Transaction transaction);
    void DeleteTransaction(TransactionBo transaction);
    
	
}
