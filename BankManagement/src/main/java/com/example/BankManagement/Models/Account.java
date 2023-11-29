package com.example.BankManagement.Models;

import lombok.Data;

@Data
public class Account {
    private String accountNumber;
    private double accountBalance;
    private Product product;
}