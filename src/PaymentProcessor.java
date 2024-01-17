public class PaymentProcessor {
    private PaymentService paymentService;

    public PaymentProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void process(double amount) {
        boolean success = paymentService.processPayment(amount);
        if (success) {
            System.out.println("Payment processed successfully");
        } else {
            System.out.println("Payment processing failed");
        }
    }
}
