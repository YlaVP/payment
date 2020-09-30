package ru.exapmple.app.myexception;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@ToString
public class Checking {
    private int number;
    private double balance;

    public Checking(int number) {
        this.number = number;
    }

    public void limit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount <= balance) {
            balance -= amount;
        }else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }
}