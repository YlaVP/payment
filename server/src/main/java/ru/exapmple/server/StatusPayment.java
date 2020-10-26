package ru.exapmple.server;

public class StatusPayment {
    private boolean status;
    public StatusPayment(final boolean status){
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
