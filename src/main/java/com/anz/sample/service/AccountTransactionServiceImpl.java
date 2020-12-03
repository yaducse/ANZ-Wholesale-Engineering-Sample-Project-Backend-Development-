package com.anz.sample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.sample.dto.AccountTransactionDTO;
import com.anz.sample.entity.AccountTransactionEntity;
import com.anz.sample.exception.ANZSampleProjectException;
import com.anz.sample.repository.AccountListRepository;
import com.anz.sample.repository.AccountTransactionRepository;
import com.anz.sample.utility.ANZSampleProjectConstants;

@Service("accountTransactionService")
public class AccountTransactionServiceImpl implements AccountTransactionService {
	
	@Autowired
	AccountTransactionRepository accountTransactionRepository;
	
	@Autowired
	AccountListRepository accountListRepository;
	
	//Method for viewing account transactions
	@Override
	public List<AccountTransactionDTO> getAccountTransactions(long accountNumber) throws ANZSampleProjectException {
		List<AccountTransactionEntity> accountTransactionList = accountTransactionRepository.findByAccountNumber(accountNumber);
		
		if (accountTransactionList.isEmpty()) {
			throw new ANZSampleProjectException(ANZSampleProjectConstants.ACCOUNT_TRANSACTION_NOT_FOUND.toString());
		}
		
		List<AccountTransactionDTO> accountTransactionDtoList = new ArrayList<>();
		
		for (AccountTransactionEntity accountTransactionEntity : accountTransactionList) {
			AccountTransactionDTO accountTransactionDTO = AccountTransactionDTO.prepareAccountTransactionDTO(accountTransactionEntity);
			accountTransactionDtoList.add(accountTransactionDTO);
		}
		return accountTransactionDtoList;
	}

}
