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
    Integer bill = 0;
    Boolean isLoyaltyPartner;

    public Client(Boolean isLoyaltyPartner) {
        clientsCount++;
        id = clientsCount;
        this.isLoyaltyPartner = isLoyaltyPartner;
    }
    public void addPayment(Integer amount){
        bill+=amount;
    }
    @Override
    public String toString(){
        return String.valueOf(id);
    }
}
