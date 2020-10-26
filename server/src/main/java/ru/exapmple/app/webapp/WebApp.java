package ru.exapmple.app.webapp;

public class WebApp implements Application {
    private String phoneNumber;
    private String accountNumber;

    public WebApp() {

    }


    @Override
    public void payOperation() {

    }

    public WebApp (final String phoneNumber, final String accountNumber){
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
