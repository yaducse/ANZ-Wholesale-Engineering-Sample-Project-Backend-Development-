package com.anz.sample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.anz.sample.dto.AccountListDTO;
import com.anz.sample.entity.AccountListEntity;
import com.anz.sample.exception.ANZSampleProjectException;
import com.anz.sample.repository.AccountListRepository;
import com.anz.sample.utility.ANZSampleProjectConstants;

@Service("accountListService")
@PropertySource("classpath:validationMessage.properties")
public class AccountListServiceImpl implements AccountListService {
	
	@Autowired
	AccountListRepository accountListRepository;
	
	//Method for viewing account list
	@Override
	public List<AccountListDTO> getAccountList() throws ANZSampleProjectException {
		List<AccountListEntity> accountList = accountListRepository.findAll();
		
		if (accountList.isEmpty()) {
			throw new ANZSampleProjectException(ANZSampleProjectConstants.ACCOUNT_LIST_NOT_FOUND.toString());
		}
		
		List<AccountListDTO> accountDtoList = new ArrayList<>();
		for (AccountListEntity accountListEntity : accountList) {
			AccountListDTO accountListDTO = AccountListDTO.prepareAccountListDTO(accountListEntity);
			accountDtoList.add(accountListDTO);
		}
		return accountDtoList;
	}

}
