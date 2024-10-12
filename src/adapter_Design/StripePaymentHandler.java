package adapter_Design;

public class StripePaymentHandler implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment using Stripe : " + amount);
    }
}
