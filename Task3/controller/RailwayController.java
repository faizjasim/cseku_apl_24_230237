// RailwayController: Manages operations related to passengers and interacts with the passenger repository and views.
package RailwayManagement.controller;

import RailwayManagement.model.*;
import RailwayManagement.view.ConsoleView;

public class RailwayController {
    private PassengerRepository passengerRepository;
    private ConsoleView consoleView;

    public RailwayController(PassengerRepository passengerRepository, ConsoleView consoleView) {
        this.passengerRepository = passengerRepository;
        this.consoleView = consoleView;
    }

    public void addPassenger(String name, int age) {
        Passenger passenger = new Passenger(name, age);
        passengerRepository.addPassenger(passenger);
        consoleView.displayMessage("Passenger added: " + name);
    }
}
