package Unknown;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Flight> result = findPlanesLeavingInTheNextTwoHours(Airport.getInstance());
        result.forEach(System.out::println);
        System.out.println("Количество - " + result.size());

    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        long time = System.currentTimeMillis() + (2 * 3600 * 1000);
        Date dateNow = new Date();
        Date dateTwoHours = new Date(time);
        return airport.getTerminals()
                .stream()
                .flatMap(s -> s.getFlights().stream())
                .filter(s -> s.getType() == Flight.Type.DEPARTURE)
                .filter(s -> s.getDate().before(dateTwoHours) && s.getDate().after(dateNow))
                .toList();
    }
}