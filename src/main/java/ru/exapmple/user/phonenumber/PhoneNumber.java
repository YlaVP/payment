package ru.exapmple.user.phonenumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class PhoneNumber {
    public static boolean checkTelNumber(String telNumber)
    {
        if (telNumber!=null) {
            String reg = "(\\+?\\d+\\(?\\d{3}\\)?\\d{2}\\-?\\d{2}\\-?\\d{2,3})";
            Pattern p = Pattern.compile(reg);
            Matcher m = p.matcher(telNumber);
            return m.matches();
        }else  {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(( "+380501234567" ));

    }

}
