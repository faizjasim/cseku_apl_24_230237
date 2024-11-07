package RailwayManagement;

//BookingService.java (ISP)
// Interface for booking actions, enabling separation of booking and cancellation functionalities.

public interface BookingService {

    // Books a ticket for a specified passenger on a specified train.
    void bookTicket(Passenger passenger, ITrain train);

    // Cancels a ticket with the specified ticket ID.
    void cancelTicket(int ticketId);
}
