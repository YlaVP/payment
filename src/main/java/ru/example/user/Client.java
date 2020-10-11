package ru.example.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public
class Client {
    private String phoneNumber;
    private String accountNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "User{" + "phoneNumber='" + phoneNumber + '\'' + ", accountNumber='" + accountNumber + '\'' + '}';
    }
}



