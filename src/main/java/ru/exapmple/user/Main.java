package ru.exapmple.user;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("+1111111111", "123456789");
        Predicate<String> checker = s -> s.length() >= 11;
        Supplier<String> supplier = () -> "Проверка номера -";

        new PhoneCheck().print(supplier, checker, client);
    }
}

