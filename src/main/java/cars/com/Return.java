package cars.com;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

/**
 * Created by mruga on 24.11.2016.
 */
@Getter
@Setter
public class Return {
    DateTime rentalEnd;
    Integer kilometersDriven;
    Rental rental;
    Integer lostBusbyCount;
    Boolean lackOfRegistrationCertificate;

    @java.beans.ConstructorProperties({"rentalEnd", "kilometersDriven", "client", "rental", "lostBusbyCount", "lackOfRegistrationCertificate"})
    public Return(String rentilEnd, Integer kilometersDriven, Rental rental, Integer lostBusbyCount, Boolean lackOfRegistrationCertificate) {
        this.rentalEnd = DateParser.parse(rentilEnd);
        this.kilometersDriven = kilometersDriven;
        this.rental = rental;
        this.lostBusbyCount = lostBusbyCount;
        this.lackOfRegistrationCertificate = lackOfRegistrationCertificate;
    }
    public Return(String rentalEnd, Integer kilometersDriven, Rental rental){
        this.kilometersDriven = kilometersDriven;
        this.rentalEnd = DateParser.parse(rentalEnd);
        this.rental = rental;
    }
}
