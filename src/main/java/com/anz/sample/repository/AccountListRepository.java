package com.anz.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anz.sample.entity.AccountListEntity;

@Repository
public interface AccountListRepository extends JpaRepository<AccountListEntity, Long> {
	AccountListEntity findByAccountNumber(long accountNumber);
}
