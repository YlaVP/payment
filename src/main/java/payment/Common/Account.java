package payment.Common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@ToString

@Component()
public class Account {
    private String accountNumber;
    private Currency currency;
    private double balance;

    public Account() {
    }
}
