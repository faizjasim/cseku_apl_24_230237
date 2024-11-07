package RailwayManagement;

// TicketBooking.java (Single Responsibility Principle - SRP)
// Class for booking tickets, implementing BookingService to handle ticket bookings specifically.
class TicketBooking implements BookingService {

    @Override
    public void bookTicket(Passenger passenger, ITrain train) {
        // Booking logic here
    }

    @Override
    public void cancelTicket(int ticketId) {
        // Not used in booking
    }
}
