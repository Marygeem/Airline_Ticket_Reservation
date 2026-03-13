import java.util.*;

public class FlightReservation {

    private String reservationNumber;
    private FlightInstance flight;
    private Map<Passenger, FlightSeat> seatMap;
    private Date creationDate;
    private ReservationStatus status;

    public static FlightReservation fetchReservationDetails(String reservationNumber) {
        return null;
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<>(seatMap.keySet());
    }
}