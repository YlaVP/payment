package ru.example.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor

@Component("account")
public class Account {
    private String accountNumber;
    private Currency currency;
    private double balance;

}
