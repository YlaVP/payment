package payment.App;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter


public class WebApp implements Application{

    private String phoneNumber;
    private String accountNumber;

    @Override
    public void payTransactions() {

    }

//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    @Bean
//    public PhoneCheck phoneCheck() {
//        return new PhoneCheck();
//    }
//
//    @Override
//    public void payTransactions() {
//
//    }

}
