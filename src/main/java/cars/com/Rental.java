package cars.com;

import org.joda.time.DateTime;

/**
 * Created by mruga on 24.11.2016.
 */
public class Rental {
    CarCategory.CATEGORY categoryPrefernce;
    Boolean wantBikeCarrier;
    Boolean wantBabySupport;
    DateTime rentalStart;
    DateTime rentalPredictedDate;
    Client client;
    Car car;

    @java.beans.ConstructorProperties({"categoryPrefernce", "wantBikeCarrier", "wantBabySupport", "rentalStart", "rentalPredictedDate", "client"})
    public Rental(CarCategory.CATEGORY prefernce, Boolean wantBikeCarrier, Boolean wantBabySupport, String rentalStart, String rentalPredictedDate, Client client) {
        this.categoryPrefernce = prefernce;
        this.wantBikeCarrier = wantBikeCarrier;
        this.wantBabySupport = wantBabySupport;
        this.rentalStart = DateParser.parse(rentalStart);
        this.rentalPredictedDate = DateParser.parse(rentalPredictedDate);
        this.client = client;
    }

    public CarCategory.CATEGORY getCategoryPrefernce() {
        return this.categoryPrefernce;
    }

    public Boolean getWantBikeSupport() {
        return this.wantBikeCarrier;
    }

    public Boolean getWantBabyCarrier() {
        return this.wantBabySupport;
    }

    public DateTime getRentalStart() {
        return this.rentalStart;
    }

    public DateTime getRentalPredictedDate() {
        return this.rentalPredictedDate;
    }

    public Client getClient() {
        return this.client;
    }

    public Car getCar() {
        return this.car;
    }

    public void setCategoryPrefernce(CarCategory.CATEGORY categoryPrefernce) {
        this.categoryPrefernce = categoryPrefernce;
    }

    public void setWantBikeCarrier(Boolean wantBikeCarrier) {
        this.wantBikeCarrier = wantBikeCarrier;
    }

    public void setWantBabySupport(Boolean wantBabySupport) {
        this.wantBabySupport = wantBabySupport;
    }

    public void setRentalStart(DateTime rentalStart) {
        this.rentalStart = rentalStart;
    }

    public void setRentalPredictedDate(DateTime rentalPredictedDate) {
        this.rentalPredictedDate = rentalPredictedDate;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Rental;
    }

    public String toString() {
        return "cars.com.Rental(categoryPrefernce=" + this.getCategoryPrefernce() + ", wantBikeCarrier=" + this.getWantBikeSupport() + ", wantBabySupport=" + this.getWantBabyCarrier() + ", rentalStart=" + this.getRentalStart() + ", rentalPredictedDate=" + this.getRentalPredictedDate() + ", client=" + this.getClient() + ")";
    }
}
