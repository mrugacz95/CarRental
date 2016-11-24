package cars.com;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import org.joda.time.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mruga on 24.11.2016.
 */
@Getter
@Setter
public class Rental {
    SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/MM/yyyy");
    CarCategory.CATEGORY prefernce;
    Boolean isLoyaltyPartner;
    Boolean wantBikeCarrier;
    Boolean wantBabySupport;
    Date rentalStart;
    Date rentalPredictedDate;

    @java.beans.ConstructorProperties({"simpleDateFormat", "prefernce", "isLoyaltyPartner", "wantBikeCarrier", "wantBabySupport", "rentalStart", "rentialPredictedDate"})
    public Rental(CarCategory.CATEGORY prefernce, Boolean isLoyaltyPartner, Boolean wantBikeCarrier, Boolean wantBabySupport, String rentalStart, String rentialPredictedDate) {
        this.simpleDateFormat = simpleDateFormat;
        this.prefernce = prefernce;
        this.isLoyaltyPartner = isLoyaltyPartner;
        this.wantBikeCarrier = wantBikeCarrier;
        this.wantBabySupport = wantBabySupport;
        try {
            this.rentalStart = simpleDateFormat.parse(rentalStart);
            this.rentalPredictedDate = simpleDateFormat.parse(rentialPredictedDate);
        }
        catch (Exception e){

        }
    }
}
