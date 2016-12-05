package cars.com;

import lombok.*;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mruga on 24.11.2016.
 */
@AllArgsConstructor
@Data
public class Car {
    private static int carCount = 0;
    public Integer id;
    public CarCategory.CATEGORY carCategory;
    public List<Rental> carRentals = new ArrayList<>();
    public Boolean available = true;

    @java.beans.ConstructorProperties({"carCategory"})
    public Car(CarCategory.CATEGORY carCategory) {
        this.carCategory = carCategory;
        id = carCount++;
    }

    public void addRental(Rental rental){
        carRentals.add(rental);
    }
    public boolean isAvailable(DateTime dateTime){
        for(Rental rental : carRentals){
            if(rental.getRentalEnd()==null) return false;
            if(dateTime.isBefore(rental.getRentalStart()) && dateTime.isAfter(rental.getRentalEnd()))
                return false;
        }
        return true;
    }

}
