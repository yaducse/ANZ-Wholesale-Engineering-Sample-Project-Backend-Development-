package com.anz.sample.service;

import java.util.List;

import com.anz.sample.dto.AccountListDTO;
import com.anz.sample.exception.ANZSampleProjectException;

public interface AccountListService {
	
	//Method for viewing account list
	public List<AccountListDTO> getAccountList() throws ANZSampleProjectException; 
	
}
