package com.example.bankaccountms.repos;

import com.example.bankaccountms.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface IAccountRepository extends JpaRepository<Account, String> {
   @RestResource(path = "/byCurrency")
    List<Account> findByCurrency(@Param("c") String currency);
}
