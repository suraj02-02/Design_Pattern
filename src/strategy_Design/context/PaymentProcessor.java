package strategy_Design.context;

import strategy_Design.strategy_interface.PaymentStrategy;

/**
 * <p>
 *     This is <code>Context Class</code> of <code>Strategy Design Pattern</code>
 * </p>
 * <p>
 *     It holds the reference of <code>Strategy</code> interface.
 * </p>
 * <p>
 *     Based on the actual implementation of <code>Strategy</code> it calls the <code>pay()</code> method of <code>Concrete Strategy</code>
 * </p>
 *
 */

public class PaymentProcessor {

    private PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(long amount){
        paymentStrategy.pay(amount);
    }

}
