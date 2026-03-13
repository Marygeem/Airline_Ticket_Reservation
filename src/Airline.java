import java.util.List;
import java.util.ArrayList;
public class Airline {

    private String name;
    private String code;
    private List<Flight> flights;

    public Airline(String name, String code) {
        this.name = name;
        this.code = code;
        this.flights = new ArrayList<>();
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
