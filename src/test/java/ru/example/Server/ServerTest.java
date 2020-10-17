package ru.example.Server;

import org.junit.Test;
import ru.example.common.Account;
import ru.example.common.Currency;
import ru.example.common.Phone;
import ru.example.common.PhonePayment;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ServerTest {

    @Test
    public void phonePayment() {
        Server server = new Server();
        Account account1 = new Account("1111111", Currency.RUB, 500.50);
        Account account2 = new Account("3333333", Currency.RUB, 300.50);
        Phone phone = new Phone("999999999");
        PhonePayment phonePayment = new PhonePayment(account1, account2, phone,
                Currency.RUB, 200.00);
        assertThat(server.PhonePayment(phonePayment, (Double x) ->
                {x = phonePayment.getAmount();
                    return x >= 0;}
        ), is(Boolean.TRUE));
    }
}