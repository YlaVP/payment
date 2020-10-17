package ru.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.example.Server.Server;


@ComponentScan(basePackages = "payment")
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Server server = context.getBean("server", Server.class);
        //Account account1 = context.getBean("account", Account.class);
//        Account account2 = context.getBean("account", Account.class);
        //Phone phone = context.getBean("phone", Phone.class);
//        PhonePayment phonePayment = context.getBean("phonePayment", PhonePayment.class);
//
//        server.PhonePayment(phonePayment, (Double x) ->
//        {x = phonePayment.getAmount();
//            return x >= 0;});
//        System.out.println(account1.getBalance());
//        System.out.println(account2.getBalance());
//        context.close();
        System.out.println(server);
    }
}







