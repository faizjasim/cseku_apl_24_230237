package RailwayManagement;

// This class representing a passenger with basic details such as name and age.
public class Passenger {
    private String name;
    private int age;

    /**
     * @param name
     * @param age
     */
    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
