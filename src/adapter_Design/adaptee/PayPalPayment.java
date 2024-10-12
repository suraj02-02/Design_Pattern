package adapter_Design.adaptee;

/**
 * <p>
 *     This is a <code>Adaptee component</code> in <code>Adapter Design Pattern</code>
 *     Client will interact with this component through <code>Adapter</code>
 * </p>
 */

public class PayPalPayment {

    public void doPayment(double amount) {
        System.out.println("Processing payment using PayPal : " + amount);
    }
}
