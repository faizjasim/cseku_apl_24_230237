package RailwayManagement;

// Class implementing BookingService to handle ticket cancellations.

public class TicketCancellation implements BookingService {

    @Override
    public void bookTicket(Passenger passenger, ITrain train) {
        // Not used in cancellation
    }

    // Cancels a ticket based on the ticket ID.
    @Override
    public void cancelTicket(int ticketId) {
        // Cancellation logic here
    }
}
