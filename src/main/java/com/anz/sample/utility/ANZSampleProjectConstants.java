package com.anz.sample.utility;

public enum ANZSampleProjectConstants {
	
	GENERAL_EXCEPTION_MESSAGE("general.exception.message"),
	ACCOUNT_LIST_NOT_FOUND("account.list.not.found"),
	ACCOUNT_TRANSACTION_NOT_FOUND("account.transaction.not.found");
	
	private final String type;

	ANZSampleProjectConstants(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return this.type;
	}
}
