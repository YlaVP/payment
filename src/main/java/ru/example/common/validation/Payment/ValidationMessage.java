package ru.example.common.validation.Payment;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public enum ValidationMessage {
    PHONE("Phone number not valid"),
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
