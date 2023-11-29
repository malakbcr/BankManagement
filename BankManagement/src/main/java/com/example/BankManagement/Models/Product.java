package com.example.BankManagement.Models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Product {
    private String productCode;
    private String productName;
    private ArrayList<Services> serviceList;
}
