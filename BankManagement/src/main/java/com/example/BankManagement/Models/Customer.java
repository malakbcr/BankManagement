package com.example.BankManagement.Models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
class Customer {
    private String customerCode;
    private String customerName;
    ArrayList<Account> accountList = new ArrayList<>();
}
