package ru.exapmple.user;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Check {
//я еще из логики метод мейн не убирала
    public static void main(String[] args) {
        ru.exapmple.user.Client client = new Client("+1111111111","123456789");
        Predicate<String> checker = s -> s.length() >= 11;
        Supplier<String> supplier = () -> "Проверка номера -";

        new PhoneCheck().result(supplier, checker, client);
    }
}


