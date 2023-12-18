package com.example.bankaccountms;

import com.example.bankaccountms.entities.Account;
import com.example.bankaccountms.enums.AccountType;
import com.example.bankaccountms.repos.IAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class BankAccountMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAccountMsApplication.class, args);

    }
    @Bean
    public CommandLineRunner start(IAccountRepository bankAccountRepository) {
        return args -> {
                for (int i = 1; i < 10; i++) {
                    Account bankAccount = Account.builder()
                            .id(UUID.randomUUID().toString())
                            .type(Math.random() > 0.5 ? AccountType.CURRENT_ACCOUNT : AccountType.SAVING_ACCOUNT)
                            .balance(10000 + Math.random() * 90000)
                            .created_at(new Date())
                            .currency("MAD")
                            .build();
                    bankAccountRepository.save(bankAccount);
                }
        };
}

}

