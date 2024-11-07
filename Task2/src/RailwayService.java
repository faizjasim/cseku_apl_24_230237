package RailwayManagement;

// Class for managing railway booking and payment processes.
// Uses dependency injection to coordinate booking, passenger management, and payment processing.

class RailwayService {
    // Dependencies for booking, passenger management, and payment processing.
    private final BookingService bookingService;
    private final PassengerService passengerService;
    private final PaymentProcessor paymentProcessor;

    /**
     * Constructor to initialize RailwayService with required services.
     * @param bookingService 
     * @param passengerService 
     * @param paymentProcessor 
     */
    public RailwayService(BookingService bookingService, PassengerService passengerService, PaymentProcessor paymentProcessor) {
        this.bookingService = bookingService;
        this.passengerService = passengerService;
        this.paymentProcessor = paymentProcessor;
    }

    /**
     * Books a ticket for a passenger on a specified train and processes payment.
     * @param passenger 
     * @param train 
     * @param amount
     */
    public void bookPassengerTicket(Passenger passenger, ITrain train, double amount) {
        bookingService.bookTicket(passenger, train);                          // Books the ticket
        paymentProcessor.processPayment(amount);                              // Processes the payment
    }
}
