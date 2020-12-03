package com.anz.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.sample.dto.AccountTransactionDTO;
import com.anz.sample.exception.ANZSampleProjectException;
import com.anz.sample.service.AccountTransactionService;

@RestController
@RequestMapping("/transactions")
public class AccountTransactionController {
	
	@Autowired
	AccountTransactionService accountTransactionService;
	
	//Method for viewing account transactions
	@GetMapping(value = "{accountNumber}")
	ResponseEntity<List<AccountTransactionDTO>> getAccountTransactions(@PathVariable("accountNumber") long accountNumber) throws ANZSampleProjectException {
		return ResponseEntity.ok(accountTransactionService.getAccountTransactions(accountNumber));
	}
}
