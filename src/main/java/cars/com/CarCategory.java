package cars.com;

import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * Created by mruga on 24.11.2016.
 */
@AllArgsConstructor
public class CarCategory {
    public enum CATEGORY {A,B,D};
    CATEGORY category;
    Integer priceBelow3Days;
    Integer priceOver3Days;
    Integer babyCarrierPrice;
    Integer BikeSupportPrice;
}
