package ru.example.common;

import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;
import ru.example.common.validation.Payment.PhoneValidation;
import ru.example.common.validation.Payment.ValidationMessage;


@Getter
@ToString

public class Phone <T> {
    private T phone;

    public Phone(T phone) {
        this.phone = phone;
    }

    public Phone<T> checkTelNumber(String number) {
        String a = phone.toString();

        boolean rsl = a.matches("(\\+?\\d+\\(?\\d{3}\\)?\\d{2}\\-?\\d{2}\\-?\\d{2,3})");


        if (!rsl) {
            String vm = ValidationMessage.PHONE.getMessage();
            throw new PhoneValidation(vm, phone.toString());
        }
        return this;
    }
}
