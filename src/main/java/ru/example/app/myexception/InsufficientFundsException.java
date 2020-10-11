package ru.example.app.myexception;

public class InsufficientFundsException extends RuntimeException {
    public final String message = "Отказ, недостаточно средств для перевода";
    private double amount;

    public double getAmount() {
        return amount;
    }

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public InsufficientFundsException(String message, Throwable cause, double amount) {
        super(message, cause);
        this.amount = amount;
    }

    public InsufficientFundsException(Throwable cause, double amount) {
        super(cause);
        this.amount = amount;
    }

    public InsufficientFundsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, double amount) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.amount = amount;
    }

}



