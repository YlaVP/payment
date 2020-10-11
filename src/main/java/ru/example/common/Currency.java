package ru.example.common;


public enum Currency {
    RUB("P"), EUR("$"), USD("&");
    private String cymbol;

    Currency(String cymbol) {
        this.cymbol = cymbol;
    }

    public String getCode() {
        return cymbol;
    }
}


