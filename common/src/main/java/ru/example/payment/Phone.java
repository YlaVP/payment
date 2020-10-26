package ru.example.payment;

import ru.example.payment.validation.PhoneValidation;
import ru.example.payment.validation.ValidationMessage;


public class Phone <T> {
    private T phone;

    public Phone(T phone) {
        this.phone = phone;
    }

    public boolean checkTelNumber(String number) {
        String a = phone.toString();
        boolean rsl = a.matches("(\\+?\\d+\\(?\\d{3}\\)?\\d{2}\\-?\\d{2}\\-?\\d{2,3})");

        if (!rsl) {

            String vm = ValidationMessage.PHONE.getMessage();
            throw new PhoneValidation(vm, this.phone.toString());
        } else {
            return false;
        }
    }

    public T getPhone() {
        return phone;
    }


    public String toString() {
        return "Phone(phone=" + this.getPhone() + ")";
    }
}

