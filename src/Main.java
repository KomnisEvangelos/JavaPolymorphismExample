
public class Main {
    public static void main(String[] args) {

        PaymentService creditCard = new CreditCardPayment();
        PaymentService paypal = new PayPalPayment();

        PaymentProcessor creditCardProcessor = new PaymentProcessor(creditCard);
        creditCardProcessor.process(50.0);

        PaymentProcessor paypalProcessor = new PaymentProcessor(paypal);
        paypalProcessor.process(50.0);


    }
}

