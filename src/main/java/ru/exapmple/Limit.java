package ru.exapmple;

import lombok.SneakyThrows;

public class Limit {

        @SneakyThrows
                public static void main(String [] args) {
                Checking c = new Checking(101);
                System.out.println("Остаток 300 рублей...");
                c.limit(300.00);

                try {
                        System.out.println("\nПеревод 100 рублей...");
                        c.withdraw(100.00);
                        System.out.println("\nПеревод 400 рублей...");
                        c.withdraw(400.00);
                } catch (InsufficientFundsException e) {
                        System.out.println("Извините, но у Вас всего рублей " + e.getAmount());
                        e.printStackTrace();

                }


        }
}