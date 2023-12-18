package com.example.bankaccountms.web;

import com.example.bankaccountms.dto.AccountRequestDTO;
import com.example.bankaccountms.dto.AccountResponseDTO;
import com.example.bankaccountms.entities.Account;
import com.example.bankaccountms.mappers.AccountMapper;
import com.example.bankaccountms.repos.IAccountRepository;
import com.example.bankaccountms.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountRestController {
    private IAccountRepository accountRepository;
    private AccountService accountService;
    private AccountMapper accountMapper;

    public AccountRestController(IAccountRepository accountRepository, AccountService accountService, AccountMapper accountMapper){
        this.accountRepository=accountRepository;
        this.accountService = accountService;
        this.accountMapper = accountMapper;
    }

    @GetMapping("/accounts")
    public List<Account> accounts(){
        return accountRepository.findAll();
    }
    @GetMapping("/accounts/{id}")
    public Account account(@PathVariable String id){
        return accountRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Account %s not found"+id)));
    }
    @PostMapping("/accounts")
    public AccountResponseDTO save(@RequestBody AccountRequestDTO requestDTO){
        //if (account.getId()==null) account.setId(UUID.randomUUID().toString());
       // if (account.getCreated_at()==null) account.setCreated_at(new Date());
        return accountService.addAccount(requestDTO);
    }

//    @PutMapping("/accounts/{id}")
//    public AccountResponseDTO update(@PathVariable String id,@RequestBody AccountRequestDTO account){
//
//    }

    @DeleteMapping("/accounts/{id}")
    public void deleteAccount(@PathVariable String id){
        accountRepository.deleteById(id);
    }

}
