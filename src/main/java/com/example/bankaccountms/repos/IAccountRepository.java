package com.example.bankaccountms.repos;

import com.example.bankaccountms.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface IAccountRepository extends JpaRepository<Account, String> {

    List<Account> findByCurrency(String currency);
}
