// Passenger: Represents the data and attributes of a railway passenger.

package RailwayManagement.model;

// Represents a passenger entity
public class Passenger {
    private String name;
    private int age;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
