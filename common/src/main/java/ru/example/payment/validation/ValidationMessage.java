package ru.example.payment.validation;

public enum ValidationMessage {
    PHONE("Phone is not correct"),
    CURRENCY("Currency is not correct"),
    AMOUNT("Amount is not currect");
 private String message;

    ValidationMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
