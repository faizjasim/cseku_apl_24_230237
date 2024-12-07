package RailwayManagement.view;
// ConsoleView: Handles displaying messages and errors to the user in the console.
// Handles console-based user interaction
public class ConsoleView {

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayError(String error) {
        System.err.println(error);
    }
}
