package com.example.bankaccountms.entities;

import com.example.bankaccountms.enums.AccountType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity @Data @Builder @AllArgsConstructor @NoArgsConstructor
public class Account {

    @Id
    private String id;
    private Date created_at;
    private Double balance;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
}
