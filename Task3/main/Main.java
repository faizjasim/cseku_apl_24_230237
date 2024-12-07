package RailwayManagement;

import RailwayManagement.controller.BookingController;
import RailwayManagement.controller.RailwayController;
import RailwayManagement.model.*;
import RailwayManagement.view.ConsoleView;
import RailwayManagement.view.ReportView;

public class Main {
    public static void main(String[] args) {
        // Initialize model
        PassengerRepository passengerRepository = new PassengerRepository();

        // Initialize view
        ConsoleView consoleView = new ConsoleView();
        ReportView reportView = new ReportView();

        // Initialize controllers
        RailwayController railwayController = new RailwayController(passengerRepository, consoleView);
        BookingController bookingController = new BookingController(consoleView);

        // Add passengers
        railwayController.addPassenger("John Doe", 30);
        railwayController.addPassenger("Jane Smith", 25);

        // Create a train
        Train train = new Train("City A to City B", "10:00 AM");

        // Book tickets
        Passenger passenger1 = passengerRepository.getAllPassengers().get(0);
        Passenger passenger2 = passengerRepository.getAllPassengers().get(1);
        bookingController.bookTicket(passenger1, train, 50.0);
        bookingController.bookTicket(passenger2, train, 60.0);

        // Generate booking report
        reportView.displayBookingReport(bookingController.getBookings());
    }
}
