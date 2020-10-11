package ru.example.app.myexception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Checking {

    private int number;
    private double balance;

    public Checking(int number) {
        this.number = number;
    }
    public Checking(double balance) {
        this.balance = balance;
    }
    public void limit(double amount) {
        balance += amount;
    }
    public boolean withdraw(double amount) {
        boolean a = false;
        if (amount <= balance) {
            balance -= amount;
            a = true;
        } else {
            throw new InsufficientFundsException(amount);
        }

        return a;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
}





