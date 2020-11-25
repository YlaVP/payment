package ru.example.payment.common;


import lombok.Getter;
import lombok.ToString;


@Getter
@ToString


public class Account {
    private String accountNumber;
    private Currency currency;
    private double balance;

    public Account() {

    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String accountNumber, Currency currency, double balance) {
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.balance = balance;
    }

    public String toString() {
        return "Accont(accountNumber=" + this.getAccountNumber() + ", currency=" + this.getCurrency() + ", balance" + this.getBalance() + ")";
    }
}



