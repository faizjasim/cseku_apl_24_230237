
package RailwayManagement;

// Class representing a passenger train, implementing the ITrain interface.

public class PassengerTrain implements ITrain {
    // Fields to store the schedule and route of the train.
    private String schedule;
    private String route;

    // Sets the schedule for the train.
    @Override
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    // Sets the route for the train.
    @Override
    public void setRoute(String route) {
        this.route = route;
    }
}
