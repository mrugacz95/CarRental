package cars.com;

import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * Created by mruga on 24.11.2016.
 */
@Value
@AllArgsConstructor
public class Car {
    public CarCategory carCategory;
}
