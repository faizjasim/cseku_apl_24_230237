package RailwayManagement;

// PaymentProcessor.java (ISP)
// Interface for payment processing, allowing different payment methods to implement this interface.
public interface PaymentProcessor {
    /**
     * 
     * @param amount
     */
    void processPayment(double amount);
}
