package com.example.bankaccountms.web;

import com.example.bankaccountms.entities.Account;
import com.example.bankaccountms.repos.IAccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/")
public class AccountRestController {
    private IAccountRepository accountRepository;

    public AccountRestController(IAccountRepository accountRepository){
        this.accountRepository=accountRepository;
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
    public Account save(@RequestBody Account account){
        if (account.getId()==null) account.setId(UUID.randomUUID().toString());
        if (account.getCreated_at()==null) account.setCreated_at(new Date());
        return accountRepository.save(account);
    }

    @PutMapping("/accounts/{id}")
    public Account update(@PathVariable String id,@RequestBody Account account){
        Account bankAccount = accountRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Account %s not found"+id)));
        if (account.getBalance()!= null) bankAccount.setBalance(account.getBalance());
        if (account.getCreated_at()!=null)bankAccount.setCreated_at(account.getCreated_at());
        if (account.getCurrency()!=null)bankAccount.setCurrency(account.getCurrency());
        if (account.getType()!= null)bankAccount.setType(account.getType());

        return accountRepository.save(bankAccount);
    }

    @DeleteMapping("/accounts/{id}")
    public void deleteAccount(@PathVariable String id){
        accountRepository.deleteById(id);
    }

}
