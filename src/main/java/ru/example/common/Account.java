package ru.example.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@ToString

public class Account {
    private String accountNumber;
    private Currency currency;
    private double balance;

    public Account() {
    }
}
