//import java.util.*;
//
//public class main {
//
//    public static void main(String[] args) {
//
//        System.out.println("===== AIRLINE MANAGEMENT SYSTEM =====");
//
//        Airport departureAirport = new Airport();
//        Airport arrivalAirport = new Airport();
//
//        System.out.println("Airports created.");
//
//        Aircraft aircraft = new Aircraft();
//
//        System.out.println("Aircraft created.");
//
//        Flight flight = new Flight();
//
//        System.out.println("Flight created.");
//
//        FlightInstance flightInstance = new FlightInstance();
//
//        flightInstance.updateStatus(FlightStatus.SCHEDULED);
//
//        System.out.println("Flight instance scheduled.");
//
//        Passenger passenger1 = new Passenger();
//        Passenger passenger2 = new Passenger();
//
//        System.out.println("Passengers created.");
//
//        FlightSeat seat1 = new FlightSeat();
//        FlightSeat seat2 = new FlightSeat();
//
//        System.out.println("Seats assigned.");
//
//        FlightReservation reservation = new FlightReservation();
//
//        System.out.println("Reservation created.");
//
//
//        Payment payment = new Payment();
//        payment.makeTransaction();
//
//        System.out.println("Payment processed.");
//
//        Notification notification = new EmailNotification();
//        notification.send();
//
//        System.out.println("Notification sent.");
//
//        System.out.println("===== SYSTEM RUN COMPLETE =====");
//    }
//}
import gui.MainMenuGUI;

public class Main {

    public static void main(String[] args) {

        new MainMenuGUI();

    }
}
//airline-system
//
//Main.java
//
//        gui
//MainMenuGUI.java
//SearchFlightGUI.java
//SeatSelectionGUI.java
//PassengerFormGUI.java
//PaymentGUI.java
//ConfirmationGUI.java
//
//        model
//Flight.java
//Airport.java
//Passenger.java
//Seat.java
//FlightSeat.java
//
//        reservation
//FlightReservation.java
//Itinerary.java
//
//        payment
//Payment.java
//CreditCardTransaction.java
