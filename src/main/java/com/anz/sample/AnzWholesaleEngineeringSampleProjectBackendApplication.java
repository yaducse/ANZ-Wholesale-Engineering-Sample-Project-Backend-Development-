package com.anz.sample;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anz.sample.dto.AccountListDTO;
import com.anz.sample.dto.AccountTransactionDTO;
import com.anz.sample.repository.AccountListRepository;
import com.anz.sample.repository.AccountTransactionRepository;

@SpringBootApplication
public class AnzWholesaleEngineeringSampleProjectBackendApplication implements CommandLineRunner {
	
	@Autowired
	AccountListRepository accountListRepository;
	
	@Autowired
	AccountTransactionRepository accountTransactionRepository;

	public static void main(String[] args) {
		SpringApplication.run(AnzWholesaleEngineeringSampleProjectBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/****
		 * 
		 * This run method initializes tables in data with hard-coded values
		 * 
		 */
		accountListRepository.deleteAll();
		accountTransactionRepository.deleteAll();
		
		AccountListDTO account1 = new AccountListDTO();
		account1.setAccountNumber(585309209);
		account1.setAccountName("SGSavings726");
		account1.setAccountType("Savings");
		account1.setBalanceDate(LocalDate.of(2018, 11, 8));
		account1.setCurrency("SGD");
		account1.setOpeningAvailableBalance(84327.51);
		accountListRepository.save(AccountListDTO.prepareAccountListEntity(account1));
		
		AccountListDTO account2 = new AccountListDTO();
		account2.setAccountNumber(791066619);
		account2.setAccountName("AUSavings933");
		account2.setAccountType("Savings");
		account2.setBalanceDate(LocalDate.of(2018, 11, 8));
		account2.setCurrency("AUD");
		account2.setOpeningAvailableBalance(88005.93);
		accountListRepository.save(AccountListDTO.prepareAccountListEntity(account2));
		
		AccountListDTO account3 = new AccountListDTO();
		account3.setAccountNumber(347786244);
		account3.setAccountName("AUCurrent433");
		account3.setAccountType("Current");
		account3.setBalanceDate(LocalDate.of(2018, 11, 8));
		account3.setCurrency("AUD");
		account3.setOpeningAvailableBalance(38010.62);
		accountListRepository.save(AccountListDTO.prepareAccountListEntity(account3));
		
		AccountTransactionDTO transaction1 = new AccountTransactionDTO();
		transaction1.setAccountNumber(1232223212);
		transaction1.setAccountName("Current Account");
		transaction1.setValueDate(LocalDate.of(2012, 1, 12));
		transaction1.setCurrency("SGD");
		transaction1.setCreditAmount(9540.98);
		transaction1.setDebitOrCredit("Credit");
		accountTransactionRepository.save(AccountTransactionDTO.prepareAccountTransactionEntity(transaction1));
		
		AccountTransactionDTO transaction2 = new AccountTransactionDTO();
		transaction2.setAccountNumber(1232223212);
		transaction2.setAccountName("Current Account");
		transaction2.setValueDate(LocalDate.of(2012, 1, 12));
		transaction2.setCurrency("SGD");
		transaction2.setCreditAmount(7497.82);
		transaction2.setDebitOrCredit("Credit");
		accountTransactionRepository.save(AccountTransactionDTO.prepareAccountTransactionEntity(transaction2));
		
		AccountTransactionDTO transaction3 = new AccountTransactionDTO();
		transaction3.setAccountNumber(1232223212);
		transaction3.setAccountName("Current Account");
		transaction3.setValueDate(LocalDate.of(2012, 1, 12));
		transaction3.setCurrency("SGD");
		transaction3.setCreditAmount(5564.79);
		transaction3.setDebitOrCredit("Credit");
		accountTransactionRepository.save(AccountTransactionDTO.prepareAccountTransactionEntity(transaction3));
		
	}

}
