package payment.Common.validation.Payment;

import payment.Common.Currency;

public class CurrencyValidation extends  RuntimeException{
    private Currency currency;

    public CurrencyValidation(Currency currency) {
        this.currency = currency;
    }

    public CurrencyValidation(String message, Currency currency) {
        super(message);
        this.currency = currency;
    }

    public CurrencyValidation(String message, Throwable cause, Currency currency) {
        super(message, cause);
        this.currency = currency;
    }

    public CurrencyValidation(Throwable cause, Currency currency) {
        super(cause);
        this.currency = currency;
    }

    public CurrencyValidation(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Currency currency) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.currency = currency;
    }
}
