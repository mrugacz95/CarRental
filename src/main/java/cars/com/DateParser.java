package cars.com;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.text.SimpleDateFormat;

/**
 * Created by mruga on 24.11.2016.
 */
public class DateParser {
    private static String pattern = "dd/MM/yyyy";
    public static DateTime parse(String date){
        try {
            return DateTime.parse(date, DateTimeFormat.forPattern(pattern));
        }
        catch (Exception e){
            throw new RuntimeException("Cant parse date: " + date);
        }
    }

}
