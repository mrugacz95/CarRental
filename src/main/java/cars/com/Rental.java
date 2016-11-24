package cars.com;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mruga on 24.11.2016.
 */
@Getter
@Setter
public class Rental {
    CarCategory.CATEGORY prefernce;
    Boolean wantBikeCarrier;
    Boolean wantBabySupport;
    DateTime rentalStart;
    DateTime rentalPredictedDate;
    Client client;
    Car car;

    @java.beans.ConstructorProperties({"prefernce", "wantBikeCarrier", "wantBabySupport", "rentalStart", "rentalPredictedDate", "client"})
    public Rental(CarCategory.CATEGORY prefernce, Boolean wantBikeCarrier, Boolean wantBabySupport, String rentalStart, String rentalPredictedDate, Client client) {
        this.prefernce = prefernce;
        this.wantBikeCarrier = wantBikeCarrier;
        this.wantBabySupport = wantBabySupport;
            this.rentalStart = DateParser.parse(rentalStart);
            this.rentalPredictedDate = DateParser.parse(rentalPredictedDate);
        this.client = client;
    }
}
