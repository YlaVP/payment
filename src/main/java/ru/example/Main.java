package ru.example;


import ru.example.app.myexception.Checking;
import ru.example.app.myexception.InsufficientFundsException;
import ru.example.user.Client;
import ru.example.user.PhoneCheck;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Checking c = new Checking(101.00);
        // проверка баланса

        try {
            c.withdraw(102.00);
        } catch (InsufficientFundsException e) {
            System.out.println(e.message + ". Причина - " + c.getBalance() + " < " + e.getAmount());
            e.printStackTrace(System.out); // вывод через System.out показ деталей исключения в т.ч. с указанием в программе номера строки
            System.out.println("сумма платежа " + e.getAmount() + " не корректная");

            // проверка телефона клас лямбда из класса PhoneCheck включила сюда, так как метод main должен быть один
            ru.example.user.Client client = new Client("+1111111111", "123456789");
            Predicate<String> checker = s -> s.length() >= 11;
            Supplier<String> supplier = () -> "Проверка номера -";

            new PhoneCheck().result(supplier, checker, client);

            throw e;

        }
    }
}







