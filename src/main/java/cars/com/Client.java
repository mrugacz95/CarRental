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
    Integer id;
    Integer bill = 0;
    Boolean isLoyaltyPartner;
    Car car;

    public Client(Boolean isLoyaltyPartner, int id) {
        this.id = id;
        this.isLoyaltyPartner = isLoyaltyPartner;
    }
    public void addPayment(Integer amount){
        bill+=amount;
    }
    @Override
    public String toString(){
        return "clientId="+String.valueOf(id) + ", car "+((car==null)?null:car.getId());
    }
}
