package ru.exapmple.app.validationPhone;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PhoneValidationException extends RuntimeException {

    public PhoneValidationException(String message) {
        super(message);
    }
}



