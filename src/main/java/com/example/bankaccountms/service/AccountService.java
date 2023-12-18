package com.example.bankaccountms.service;

import com.example.bankaccountms.dto.AccountRequestDTO;
import com.example.bankaccountms.dto.AccountResponseDTO;
import com.example.bankaccountms.entities.Account;

public interface AccountService {
    public AccountResponseDTO addAccount(AccountRequestDTO accountDTO);
//    public AccountResponseDTO updateAccount(AccountRequestDTO accountRequestDTO);
}
