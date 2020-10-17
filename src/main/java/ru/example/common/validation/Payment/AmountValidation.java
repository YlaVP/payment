package ru.example.common.validation.Payment;

public class AmountValidation extends RuntimeException{
    private double amount;

    public AmountValidation(double amount) {
        this.amount = amount;
    }

    public AmountValidation(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public AmountValidation(String message, Throwable cause, double amount) {
        super(message, cause);
        this.amount = amount;
    }

    public AmountValidation(Throwable cause, double amount) {
        super(cause);
        this.amount = amount;
    }

    public AmountValidation(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, double amount) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.amount = amount;
    }
}
