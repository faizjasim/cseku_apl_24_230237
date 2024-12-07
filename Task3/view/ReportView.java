package RailwayManagement.view;
// ReportView: Displays reports related to bookings, including passenger and revenue data.
import RailwayManagement.model.Booking;
import java.util.List;

// Displays reports
public class ReportView {

    public void displayBookingReport(List<Booking> bookings) {
        System.out.println("Booking Report:");
        for (Booking booking : bookings) {
            System.out.println("Passenger: " + booking.getPassenger().getName() +
                               ", Train: " + booking.getTrain().getRoute() +
                               ", Amount: $" + booking.getAmount());
        }
    }
}
