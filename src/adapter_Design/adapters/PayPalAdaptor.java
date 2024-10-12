package adapter_Design.adapters;

import adapter_Design.PaymentProcessor;
import adapter_Design.adaptee.PayPalPayment;

/**
 * <p>
 *    This is an <code>Adapter</code> class for <code>Adaptee</code>.
 *     It acts as a bridge between two incompatible interfaces i.e. one which the client expects and other which is an existing interface of our system.
 *  </p>
 *  <p>
 *      The <code>@link{{@link PayPalPayment}}</code> is incompatible with <code>@link{{@link PaymentProcessor}}</code> interface which is why
 *      we create an adaptor layer to delegate the request to <code>Adaptee</code>
 *  </p>
 */

public class PayPalAdaptor implements PaymentProcessor{

    private PayPalPayment payPalPayment;

    public PayPalAdaptor(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }

    @Override
    public void processPayment(double amount) {
         this.payPalPayment.doPayment(amount);
    }
}
