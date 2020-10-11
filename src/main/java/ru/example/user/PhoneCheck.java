package ru.example.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.function.Predicate;
import java.util.function.Supplier;


@AllArgsConstructor
@Getter
@ToString

public class PhoneCheck {
    private boolean check(Predicate<String> checker, Client client) {
        return checker.test(client.getPhoneNumber());
    }

    public void result(Supplier<String> supplier, Predicate<String> checker, Client client)
    {
        boolean check = check(checker, client);
        if (check) {
            System.out.println(supplier.get() + " " + client.getPhoneNumber() + " прошла успешно.");
        } else {
            System.out.println(supplier.get() + " не прошла.");
        }
    }
}

