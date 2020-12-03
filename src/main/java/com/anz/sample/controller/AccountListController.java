package com.anz.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.sample.dto.AccountListDTO;
import com.anz.sample.exception.ANZSampleProjectException;
import com.anz.sample.service.AccountListService;

@RestController
@RequestMapping("/accounts")
public class AccountListController {
	
	@Autowired
	AccountListService accountListService;
	
	//Method for viewing account list
	@GetMapping
	ResponseEntity<List<AccountListDTO>> getAccountList() throws ANZSampleProjectException {
		return ResponseEntity.ok(accountListService.getAccountList());
	}

}
