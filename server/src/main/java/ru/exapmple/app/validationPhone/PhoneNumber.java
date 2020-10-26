package ru.exapmple.app.validationPhone;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component

public class PhoneNumber {
    public boolean checkTelNumber(String telNumber) {
        if (telNumber != null) {
            String reg = "(\\+?\\d+\\(?\\d{3}\\)?\\d{2}\\-?\\d{2}\\-?\\d{2,3})";
            Pattern p = Pattern.compile(reg);
            Matcher m = p.matcher(telNumber);
            return m.matches();
        } else {
            return false;
        }
    }

}


