package ru.example.payment;


import lombok.Getter;
import lombok.ToString;
import ru.example.payment.validation.AmountValidation;
import ru.example.payment.validation.CurrencyValidation;
import ru.example.payment.validation.ValidationMessage;


@Getter
@ToString

public class PhonePayment {
    private Account accountDebt;
    private Account amountCred;
    private Phone phone;
    private Currency currency;
    private double amount;

    public PhonePayment checkPhone(){
        return this;
    }

    public PhonePayment checkCurrency() {
        if (this.currency.name().length() !=3){
            String validationMessage = ValidationMessage.CURRENCY.getMessage();
            throw new CurrencyValidation(validationMessage, this.currency);
        } else {
            return this;
        }
    }
    public PhonePayment checkAmount() {
        if (this.amount <= 0.0D) {
            String validationMessage = ValidationMessage.AMOUNT.getMessage();
            throw new AmountValidation(validationMessage, this.amount);
        } else {
            return this;
        }
    }
    public PhonePayment(Account accountDebt, Account amountCred, Phone phone, Currency currency, double amount) {
        this.accountDebt = accountDebt;
        this.amountCred = amountCred;
        this.phone = phone;
        this.currency = currency;
        this.amount = amount;
    }

    public Account getAccountDebt() {
        return accountDebt;
    }

    public Account getAmountCred() {
        return amountCred;
    }

    public Phone getPhone() {
        return phone;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return this.amount;
    }
    public String toString(){
        return "PhonePayment(accountDebt=" + this.getAccountDebt() + ", accountCred=" + this.getAmountCred() + ", phone=" + this.getPhone() + ", currency=" + this.getCurrency() + ", amout=" + this.getAmount() + ")";
    }


}
