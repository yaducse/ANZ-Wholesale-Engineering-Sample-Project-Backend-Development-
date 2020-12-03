package com.anz.sample.dto;

import java.time.LocalDate;

import com.anz.sample.entity.AccountListEntity;

public class AccountListDTO {
	

	private long accountNumber;
	private String accountName;
	private String accountType;
	private LocalDate balanceDate;
	private String currency;
	private double openingAvailableBalance;
	
	public AccountListDTO() {};
	

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
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public LocalDate getBalanceDate() {
		return balanceDate;
	}
	public void setBalanceDate(LocalDate balanceDate) {
		this.balanceDate = balanceDate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getOpeningAvailableBalance() {
		return openingAvailableBalance;
	}
	public void setOpeningAvailableBalance(double openingAvailableBalance) {
		this.openingAvailableBalance = openingAvailableBalance;
	}
	
	public static AccountListDTO prepareAccountListDTO(AccountListEntity accountListEntity) {
		AccountListDTO accountListDTO = new AccountListDTO();
		
		accountListDTO.setAccountNumber(accountListEntity.getAccountNumber());
		accountListDTO.setAccountName(accountListEntity.getAccountName());
		accountListDTO.setAccountType(accountListEntity.getAccountType());
		accountListDTO.setBalanceDate(accountListEntity.getBalanceDate());
		accountListDTO.setCurrency(accountListEntity.getCurrency());
		accountListDTO.setOpeningAvailableBalance(accountListEntity.getOpeningAvailableBalance());
		
		return accountListDTO;
	}
	
	public static AccountListEntity prepareAccountListEntity(AccountListDTO accountListDTO) {
		AccountListEntity accountListEntity = new AccountListEntity();

		accountListEntity.setAccountNumber(accountListDTO.getAccountNumber());
		accountListEntity.setAccountName(accountListDTO.getAccountName());
		accountListEntity.setAccountType(accountListDTO.getAccountType());
		accountListEntity.setBalanceDate(accountListDTO.getBalanceDate());
		accountListEntity.setCurrency(accountListDTO.getCurrency());
		accountListEntity.setOpeningAvailableBalance(accountListDTO.getOpeningAvailableBalance());
		
		return accountListEntity;
	}
	
}
