package RailwayManagement.model;

// Train: Represents the schedule and route details of a train.
// Represents a train entity
public class Train {
    private String route;
    private String schedule;

    public Train(String route, String schedule) {
        this.route = route;
        this.schedule = schedule;
    }

    public String getRoute() {
        return route;
    }

    public String getSchedule() {
        return schedule;
    }
}
