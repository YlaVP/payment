package ru.example.common.validation.Payment;

public enum ValidationMessage {
    PHONE("Phone is not correct"),
    CURRENCY("Currency is not correct"),
    AMOUNT("Amount is not correct");

    private String message;

    ValidationMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
