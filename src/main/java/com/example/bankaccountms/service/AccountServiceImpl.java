package com.example.bankaccountms.service;

import com.example.bankaccountms.dto.AccountRequestDTO;
import com.example.bankaccountms.dto.AccountResponseDTO;
import com.example.bankaccountms.entities.Account;
import com.example.bankaccountms.mappers.AccountMapper;
import com.example.bankaccountms.repos.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private IAccountRepository accountRepository;

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public AccountResponseDTO addAccount(AccountRequestDTO accountDTO) {
        //Mapping
        Account account = Account.builder()
                .id(UUID.randomUUID().toString())
                .created_at(new Date())
                .balance(accountDTO.getBalance())
                .type(accountDTO.getType())
                .currency(accountDTO.getCurrency())
                .build();
        Account accountSaved = accountRepository.save(account);
        return accountMapper.fromBankAccount(accountSaved);
    }

}
