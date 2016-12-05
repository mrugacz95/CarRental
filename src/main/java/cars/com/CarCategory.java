package cars.com;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

/**
 * Created by mruga on 24.11.2016.
 */
@AllArgsConstructor
@Data
public class CarCategory {
    public enum CATEGORY {A,B,D};
    CATEGORY cat;
    Integer priceBelow3Days;
    Integer priceOver3Days;
    Integer babyCarrierPrice;
    Integer BikeSupportPrice;
}
