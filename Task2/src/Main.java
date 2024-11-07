package RailwayManagement;

/**
 * 
 * Title: Railway Reservation and Management System
 * Description: Demonstrates the use of RailwayService to book a ticket for a passenger on a specific train.
 * 
 */

public class Main {
    public static void main(String[] args) {
        
        BookingService bookingService = new TicketBooking();
        PassengerService passengerService = new PassengerRepository();
        PaymentProcessor paymentProcessor = new CreditCardPayment();

        // Injecting dependencies into the RailwayService
        RailwayService railwayService = new RailwayService(bookingService, passengerService, paymentProcessor);

        // Creating a passenger and a train
        Passenger passenger = new Passenger("John Doe", 30);
        passengerService.addPassenger(passenger);

        
        ITrain train = new PassengerTrain();
        train.setRoute("City A to City B");
        train.setSchedule("10:00 AM");

        // Booking the ticket and processing payment
        railwayService.bookPassengerTicket(passenger, train, 50.0);
    }
}
