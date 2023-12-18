package com.example.bankaccountms.dto;

import com.example.bankaccountms.enums.AccountType;
import lombok.*;

@Getter
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class AccountRequestDTO {

    private String id;
    private Double balance;
    private String currency;
    private AccountType type;

    public String getId() {
        return id;
    }

    public Double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public AccountType getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setType(AccountType type) {
        this.type = type;
    }
}
