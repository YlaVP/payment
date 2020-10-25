package ru.exapmple.app.controller;



import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.exapmple.app.component.PhoneNumber;
import ru.exapmple.app.validation.PhoneValidationException;

@RestController
@AllArgsConstructor
public class PayRestController {

    private final PhoneNumber phoneNumber;

    @RequestMapping("/pay/{number}")
    public String pay(@PathVariable String number,
                      @RequestParam(name = "amount",defaultValue = "0") Double amount) {
        if(!phoneNumber.checkTelNumber(number)) {
            throw new PhoneValidationException("phone number not valid");

        }
        return null;

    }


}
