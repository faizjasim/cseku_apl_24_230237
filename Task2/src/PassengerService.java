
package RailwayManagement;

// PassengerService.java (ISP)
// Defines methods to manage passenger information.

public interface PassengerService {
    /**
     * Adds a new passenger to the system.
     * 
     * @param passenger
     */
    void addPassenger(Passenger passenger);

    /**
     * Retrieves a passenger by their ID.
     * 
     * @param passengerId
     * @return The Passenger object corresponding to the specified ID.
     */
    Passenger getPassenger(int passengerId);
}
