package RailwayManagement.model;

// Booking: Represents the details of a ticket booking, including passenger, train, and payment amount.

// Represents a booking entity
public class Booking {
    private Passenger passenger;
    private Train train;
    private double amount;

    public Booking(Passenger passenger, Train train, double amount) {
        this.passenger = passenger;
        this.train = train;
        this.amount = amount;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Train getTrain() {
        return train;
    }

    public double getAmount() {
        return amount;
    }
}
