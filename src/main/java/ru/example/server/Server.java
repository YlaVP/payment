package ru.example.server;


import org.springframework.stereotype.Component;
import ru.example.common.PhonePayment;
import ru.example.common.validation.Payment.AmountValidation;
import ru.example.common.validation.Payment.CurrencyValidation;
import ru.example.common.validation.Payment.PhoneValidation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;


@Component()
public class Server implements Operation {

    private final Map<PhonePayment, StatusPayment> payments = new HashMap<>();

    public Server() {
    }

    @Override
    public boolean PhonePayment(PhonePayment phonePayment, Predicate<Double> predicate) {
        boolean rsl = false;
        try {
            phonePayment.checkPhone();
        } catch (PhoneValidation e) {
            e.printStackTrace(System.out);
            System.out.println(phonePayment.getPhone());
            throw e;
        }
        try {
            phonePayment.checkCurrency();
        } catch (CurrencyValidation e) {
            e.printStackTrace(System.out);
            System.out.println(phonePayment.getCurrency());
            throw e;
        }
        try {
            if(predicate.test(phonePayment.getAmount())) {
            }
        } catch (AmountValidation e) {
            e.printStackTrace(System.out);
            System.out.println(phonePayment.getAmount());
            throw e;
        }

        if(phonePayment.getAmount() <=
                phonePayment.getAccountDebt().getBalance()) {
            phonePayment.getAccountDebt().setBalance(
                    phonePayment.getAccountDebt().getBalance() -
                            phonePayment.getAmount());
            phonePayment.getAccountCred().setBalance(
                    phonePayment.getAccountCred().getBalance() +
                            phonePayment.getAmount());
            payments.put(phonePayment, new StatusPayment(true));
            rsl = true;
        }
        return rsl;
    }


}
