package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

	@Query("select acc.amount from Account acc where acc.emailid = :emailid")
	public float findAccountByEmaild(@Param("emailid") String email);
}
