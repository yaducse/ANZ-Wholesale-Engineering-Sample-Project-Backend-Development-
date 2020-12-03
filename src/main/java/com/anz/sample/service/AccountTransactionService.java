package com.anz.sample.service;

import java.util.List;

import com.anz.sample.dto.AccountTransactionDTO;
import com.anz.sample.exception.ANZSampleProjectException;

public interface AccountTransactionService {
	
	//Method for viewing account transactions
	public List<AccountTransactionDTO> getAccountTransactions(long accountNumber) throws ANZSampleProjectException;
	
}
