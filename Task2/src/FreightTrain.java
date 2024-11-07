package RailwayManagement;

// This Class representing a FreightTrain train, implementing the ITrain interface.
public class FreightTrain implements ITrain {
    private String schedule;
    private String route;

    @Override
    /**
     * To set sedule
     * @param schedule;
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    /**
     * To set the route
     * @param route
     */
    
    public void setRoute(String route) {
        this.route = route;
    }
}
