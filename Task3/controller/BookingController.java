BookingController: Handles booking operations, including ticket bookings and managing booking data.
package RailwayManagement.controller;

import RailwayManagement.model.*;
import RailwayManagement.view.ConsoleView;

import java.util.ArrayList;
import java.util.List;

public class BookingController {
    private List<Booking> bookings = new ArrayList<>();
    private ConsoleView consoleView;

    public BookingController(ConsoleView consoleView) {
        this.consoleView = consoleView;
    }

    public void bookTicket(Passenger passenger, Train train, double amount) {
        Booking booking = new Booking(passenger, train, amount);
        bookings.add(booking);
        consoleView.displayMessage("Ticket booked for " + passenger.getName() +
                                   " on train " + train.getRoute());
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
