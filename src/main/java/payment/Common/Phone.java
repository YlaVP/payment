package payment.Common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;
import payment.Common.validation.Payment.PhoneValidation;
import payment.Common.validation.Payment.ValidationMessage;

@Getter
@ToString

@Component("phone")
public class Phone <T> {
    private T phone;

    public Phone(T phone) {
        this.phone = phone;
    }

    public Phone<T> checkTelNumber() {
        String a = phone.toString();

        boolean rsl = a.matches("(\\+?\\d+\\(?\\d{3}\\)?\\d{2}\\-?\\d{2}\\-?\\d{2,3})");
        //("^(8|\\+7)((\\[- ]?\\(?\\d{3}\\)?[\\- ]?)?(\\d{3}[\\- ]?)?(\\d{2}[\\- ]?)?\\d{2}$)?")
        //"(\\+?\\d+\\(?\\d{3}\\)?\\d{2}\\-?\\d{2}\\-?\\d{2,3})"

        if (!rsl) {
            String vm = ValidationMessage.PHONE.getMessage();
            throw new PhoneValidation(vm, phone.toString());
        }
        return this;
    }
}
