package RailwayManagement;

import java.util.*;

// PassengerRepository.java (Single Responsibility Principle)
// Implements the storage and retrieval of passenger details, following SRP.

public class PassengerRepository implements PassengerService {

    // List to store all passengers in the system.
    private List<Passenger> passengerList = new ArrayList<>();

    // Adds a new passenger to the passenger list.
    @Override
    public void addPassenger(Passenger passenger) {
        passengerList.add(passenger);
    }

    // Retrieves a passenger from the list by their ID.
    @Override
    public Passenger getPassenger(int passengerId) {
        return passengerList.get(passengerId);
    }
}
