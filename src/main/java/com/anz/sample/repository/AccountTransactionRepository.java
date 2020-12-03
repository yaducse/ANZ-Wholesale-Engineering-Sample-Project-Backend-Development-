package com.anz.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anz.sample.entity.AccountTransactionEntity;

@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountTransactionEntity, Long> {
	List<AccountTransactionEntity> findByAccountNumber(long accountNumber); 
}
