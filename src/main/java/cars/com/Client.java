package cars.com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mruga on 24.11.2016.
 */
@Getter
@Setter
public class Client {
    private static Integer clientsCount = 0;
    Integer id;
    Integer bill;
    Boolean isLoyaltyPartner;

    public Client(Boolean isLoyaltyPartner) {
        id = clientsCount;
        clientsCount++;
        this.isLoyaltyPartner = isLoyaltyPartner;
    }
}
