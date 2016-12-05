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
    public CarCategory carCategory;
    public List<Rental> carRentals = new ArrayList<>();
    public Boolean available = true;

    @java.beans.ConstructorProperties({"carCategory"})
    public Car(CarCategory carCategory) {
        this.carCategory = carCategory;
        id = carCount++;
    }

    public void addRental(Rental rental){
        carRentals.add(rental);
    }


}
