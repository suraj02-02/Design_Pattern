package adapter_Design;

/**
 * <p>
 *    This is the target interface for <code>Adapter Design Pattern</code>.
 *    It acts as the interface for the client to interact for processing user payments.
 * </p>
 *
 */

public interface PaymentProcessor {
    void processPayment(double amount);
}
