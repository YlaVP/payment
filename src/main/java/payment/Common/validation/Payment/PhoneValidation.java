package payment.Common.validation.Payment;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class PhoneValidation extends RuntimeException {
    private String phone;

    public PhoneValidation(String phone) {
        this.phone = phone;
    }

    public PhoneValidation(String message, String phone) {
        super(message);
        this.phone = phone;
    }

    public PhoneValidation(String message, Throwable cause, String phone) {
        super(message, cause);
        this.phone = phone;
    }

    public PhoneValidation(Throwable cause, String phone) {
        super(cause);
        this.phone = phone;
    }

    public PhoneValidation(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String phone) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.phone = phone;
    }
}
