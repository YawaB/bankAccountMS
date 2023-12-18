package com.example.bankaccountms.mappers;

import com.example.bankaccountms.dto.AccountResponseDTO;
import com.example.bankaccountms.entities.Account;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public AccountResponseDTO fromBankAccount(Account account){
        AccountResponseDTO accountResponseDTO = new AccountResponseDTO();
        BeanUtils.copyProperties( account, accountResponseDTO );
        return accountResponseDTO;
    }
}
