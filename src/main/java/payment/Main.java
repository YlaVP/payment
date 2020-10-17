package payment;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import payment.Common.Account;
import payment.Common.Phone;
import payment.Common.PhonePayment;
import payment.Server.Server;


@ComponentScan(basePackages = "payment")
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Server serverTest = context.getBean("serverX", Server.class);
        Account account1 = context.getBean("account1", Account.class);
        Account account2 = context.getBean("account2", Account.class);
        Phone phone = context.getBean("phone", Phone.class);
        PhonePayment phonePayment = context.getBean("phonePaymentX", PhonePayment.class);

        serverTest.PhonePayment(phonePayment, (Double x) ->
        {x = phonePayment.getAmount();
            return x >= 0;});
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        context.close();
    }
}







