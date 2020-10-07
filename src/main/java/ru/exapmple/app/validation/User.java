package ru.exapmple.app.validation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class User {
    private String phoneNumber;
    private String accountNumber;
    //придумать иную логику оплата телефона

}
