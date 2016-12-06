package cars.com;

/**
 * Created by mruga on 24.11.2016.
 */
public class CarCategory {
    public enum CATEGORY {A(59,69,10,10),B(69,79,10,10),D(79,89,10,10);
        public Integer priceBelow3Days;
        public Integer priceOver3Days;
        public Integer babyCarrierPrice;
        public Integer bikeSupportPrice;
        CATEGORY(Integer priceOver3Days, Integer priceBelow3Days, Integer babyCarrierPrice, Integer bikeSupportPrice) {
            this.priceOver3Days = priceOver3Days;
            this.priceBelow3Days = priceBelow3Days;
            this.babyCarrierPrice = babyCarrierPrice;
            this.bikeSupportPrice = bikeSupportPrice;
        }
    };
}
