package com.anz.sample.dto;

import java.time.LocalDate;

import com.anz.sample.entity.AccountTransactionEntity;

public class AccountTransactionDTO {
	
	private long accountNumber;
	private String accountName;
	private LocalDate valueDate;
	private String currency;
	private double debitAmount;
	private double creditAmount;
	private String debitOrCredit;
	private String transactionNarrative;
	
	public AccountTransactionDTO() {}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public LocalDate getValueDate() {
		return valueDate;
	}

	public void setValueDate(LocalDate valueDate) {
		this.valueDate = valueDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}

	public double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getDebitOrCredit() {
		return debitOrCredit;
	}

	public void setDebitOrCredit(String debitOrCredit) {
		this.debitOrCredit = debitOrCredit;
	}

	public String getTransactionNarrative() {
		return transactionNarrative;
	}

	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}
	
	public static AccountTransactionDTO prepareAccountTransactionDTO(AccountTransactionEntity accountTransactionEntity) {
		AccountTransactionDTO accountTransactionDTO = new AccountTransactionDTO();

		accountTransactionDTO.setAccountNumber(accountTransactionEntity.getAccountNumber());
		accountTransactionDTO.setAccountName(accountTransactionEntity.getAccountName());
		accountTransactionDTO.setValueDate(accountTransactionEntity.getValueDate());
		accountTransactionDTO.setCurrency(accountTransactionEntity.getCurrency());
		accountTransactionDTO.setDebitAmount(accountTransactionEntity.getDebitAmount());
		accountTransactionDTO.setCreditAmount(accountTransactionEntity.getCreditAmount());
		accountTransactionDTO.setDebitOrCredit(accountTransactionEntity.getDebitOrCredit());
		accountTransactionDTO.setTransactionNarrative(accountTransactionEntity.getTransactionNarrative());
		
		return accountTransactionDTO;
	}
	
	public static AccountTransactionEntity prepareAccountTransactionEntity(AccountTransactionDTO accountTransactionDTO) {
		AccountTransactionEntity accountTransactionEntity = new AccountTransactionEntity();

		accountTransactionEntity.setAccountNumber(accountTransactionDTO.getAccountNumber());
		accountTransactionEntity.setAccountName(accountTransactionDTO.getAccountName());
		accountTransactionEntity.setValueDate(accountTransactionDTO.getValueDate());
		accountTransactionEntity.setCurrency(accountTransactionDTO.getCurrency());
		accountTransactionEntity.setDebitAmount(accountTransactionDTO.getDebitAmount());
		accountTransactionEntity.setCreditAmount(accountTransactionDTO.getCreditAmount());
		accountTransactionEntity.setDebitOrCredit(accountTransactionDTO.getDebitOrCredit());
		accountTransactionEntity.setTransactionNarrative(accountTransactionDTO.getTransactionNarrative());
		
		return accountTransactionEntity;
	}
}
