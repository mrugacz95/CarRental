package cars.com;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

/**
 * Created by mruga on 24.11.2016.
 */
@Getter
@Setter
public class Rental {
    Client client;
    CarCategory.CATEGORY categoryPrefernce;
    CarCategory.CATEGORY categoryGot;
    Boolean wantBikeSupport = false;
    Boolean wantBabyCarrier = false;
    DateTime rentalStart;
    DateTime rentalPredictedDate;
    DateTime rentalEnd = null;

    @java.beans.ConstructorProperties({"categoryPrefernce", "wantBikeSupport", "wantBabyCarrier", "rentalStart", "rentalPredictedDate", "client"})
    public Rental(CarCategory.CATEGORY prefernce, Boolean wantBikeCarrier, Boolean wantBabySupport, String rentalStart, String rentalPredictedDate, Client client) {
        this.categoryPrefernce = prefernce;
        this.categoryGot = prefernce;
        this.wantBikeSupport = wantBikeCarrier;
        this.wantBabyCarrier = wantBabySupport;
        this.rentalStart = DateParser.parse(rentalStart);
        this.rentalPredictedDate = DateParser.parse(rentalPredictedDate);
        this.client = client;
    }

    public String toString() {
        return "cars.com.Rental(client="+ this.getClient() +", categoryPrefernce=" + this.getCategoryPrefernce() + ", wantBikeSupport=" + this.getWantBikeSupport() + ", wantBabyCarrier=" + this.getWantBabyCarrier() + ", rentalStart=" + this.getRentalStart() + ", rentalPredictedDate=" + this.getRentalPredictedDate() +  ")";
    }
}
