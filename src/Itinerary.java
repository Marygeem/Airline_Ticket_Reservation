import java.util.*;

public class Itinerary {

    private String customerId;
    private Airport startingAirport;
    private Airport finalAirport;
    private Date creationDate;
    private List<FlightReservation> reservations;

    public List<FlightReservation> getReservations() {
        return reservations;
    }

    public boolean makeReservation() {
        return true;
    }

    public boolean makePayment() {
        return true;
    }
}