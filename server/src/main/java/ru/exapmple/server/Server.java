package ru.exapmple.server;

import ru.example.payment.PhonePayment;
import ru.example.payment.validation.AmountValidation;
import ru.example.payment.validation.CurrencyValidation;
import ru.example.payment.validation.PhoneValidation;
import ru.exapmple.app.webapp.WebApp;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;


public class Server extends WebApp {
    private final Map<PhonePayment, StatusPayment> payments = new HashMap();

    public Server() {
        super();
    }


    public boolean PhonePayment(PhonePayment phonePayment, Predicate predicate) {
        boolean rsl = false;

    try {
        phonePayment.checkPhone();
    }catch (PhoneValidation var6){
        var6.printStackTrace(System.out);
        System.out.println(phonePayment.getPhone());
        throw var6;
    }
    try {
        phonePayment.checkCurrency();
    } catch (CurrencyValidation var5){
        var5.printStackTrace(System.out);
        System.out.println(phonePayment.getCurrency());
        throw var5;
    }
    try {
        if (predicate.test(phonePayment.getAmount())){
                    }
    } catch (AmountValidation var7){
        var7.printStackTrace();
        System.out.println(phonePayment.getAmount());
        throw var7;
    }
    if (phonePayment.getAmount() <= phonePayment.getAccountDebt().getBalance()) {
        phonePayment.getAccountDebt().setBalance(phonePayment.getAccountDebt().getBalance() - phonePayment.getAmount());
        phonePayment.getAmountCred().setBalance(phonePayment.getAmountCred().getBalance() + phonePayment.getAmount());
        this.payments.put(phonePayment, new StatusPayment(true));
        rsl = true;
    }
    return rsl;
    }
}


