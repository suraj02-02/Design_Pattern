package adapter_Design;

import adapter_Design.adaptee.PayPalPayment;
import adapter_Design.adapters.PayPalAdaptor;

/**
 *  This is a demonstration of <code>Adapter Design Pattern</code>
 */

public class Client {

    public static void main(String[] args) {

        /**
         *  Adapter Design Pattern is a structural design pattern that allows objects with incompatible interfaces to collaborate.
         *  It is used to convert the interface of a class into another interface that clients expect.
         *  The adapter pattern allows you to create objects that can work with each other without knowing their concrete classes.
         *  Basically it creates a bridge b/w two incompatible interfaces i.e one which the client expects and other which is an existing interface of our system.
         *
         *   Components Involved :
         *     1. Target Interface : @see {@link PaymentProcessor}
         *     2. Adaptee : @see {@link adapter_Design.adaptee.PayPalPayment}
         *     3. Adaptor : @see {@link }
         *
         *   Use cases :
         *      1. File Adapter
         *      2. Audio Adapter
         *      3. Can be implemented at any place where two incompatible compatible are communicating
         *
         *      Problem Statement : We have a existing payment gateway which uses stripe and now we need to use paypalt as the new payment gateway without making the client knowing its implementation.
         *      Solution : Here we will be using <code>Adapter Pattern</code> to solve this problem.
         *
         */

        // Payment through stripe
        PaymentProcessor stripePayment = new StripePaymentHandler();
        stripePayment.processPayment(20000.00);

        // Payment through paypal
        PayPalPayment payPalPayment = new PayPalPayment();
        // Adaptor layer
        PaymentProcessor payPalAdaptor = new PayPalAdaptor(payPalPayment);
        payPalAdaptor.processPayment(32000.00);

    }
}
