package com.example.IDGeneratorDemo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Utility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerId;
    private String accountId;
    private String loanId;
    private String name;
    private int age;

    public Utility() {}

    public Utility(String customerId, String accountId, String loanId, String name, int age) {
        this.customerId = customerId;
        this.accountId = accountId;
        this.loanId = loanId;
        this.name = name;
        this.age = age;
    }

}
