package RailwayManagement.model;
// PassengerRepository: Manages the storage and retrieval of passenger information.
import java.util.ArrayList;
import java.util.List;

// Manages a list of passengers
public class PassengerRepository {
    private List<Passenger> passengers = new ArrayList<>();

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public List<Passenger> getAllPassengers() {
        return passengers;
    }
}
