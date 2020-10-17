package ru.example.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;
import ru.example.common.validation.Payment.AmountValidation;
import ru.example.common.validation.Payment.CurrencyValidation;
import ru.example.common.validation.Payment.ValidationMessage;

@AllArgsConstructor
@Getter
@ToString

@Component("phonePayment")
public class PhonePayment {
    private Account accountDebt; //аккаунт списания д.с.
    private Account accountCred; //аккаунт зачисления д.с.
    private Phone phone;
    private Currency currency;
    private double amount;

    public PhonePayment checkPhone () {
        return this;
    }

    public PhonePayment checkCurrency () {
        if (currency.name().length() != 3) {
            String validationMessage = ValidationMessage.CURRENCY.getMessage();
            throw new CurrencyValidation(validationMessage, currency);
        }
        return this;
    }

    public PhonePayment checkAmount () {
        if (amount <= 0) {
            String validationMessage = ValidationMessage.AMOUNT.getMessage();
            throw new AmountValidation(validationMessage, amount);
        }
        return this;
    }
}
