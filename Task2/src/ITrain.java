package RailwayManagement;

// ITrain.java (Interface Segregation Principle - ISP)
// This Interface representing a train, defining common methods like setting schedule and route.

public interface ITrain {

    // Sets the schedule and rute for the train

    /**
     * 
     * @param schedule
     */
    void setSchedule(String schedule);
    /**
     * 
     * @param route
     */
    void setRoute(String route);
}

