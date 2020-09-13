package app;

import ru.exapmple.Operation;

public class User implements Operation {
    private int id;
    public User(int id){
        this.id = id;

        String currency;
        currency = "Рубль";

        int balance;
        balance = 500;

        int amount;
        amount = 100;

        int accountNumber;
        accountNumber = 40817810;

        int numberPhone;
        numberPhone = 891111111;

        System.out.println("Cумма перевода: " + amount);
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Номера телефона: " + numberPhone);
        System.out.println("Валюта: " + currency);
        System.out.println("Остаток: " + balance);

    }
    @Override
        public void payOperation() {
        System.out.println("Id is "+this.id);


        }

}
