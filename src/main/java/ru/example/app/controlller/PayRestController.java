package ru.example.app.controlller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.example.common.Phone;

import javax.xml.bind.ValidationException;

@RestController
@AllArgsConstructor
    public class PayRestController {

          private final Phone phone;


        @RequestMapping("/pay/{number}")
        public String pay(@PathVariable String number, @RequestParam(name = "amount",defaultValue = "0") Double amount) throws ValidationException {
            if (phone.checkTelNumber(String number)) {
                return null;
            }
            throw new ValidationException("phone number not valid");
        }

    }



