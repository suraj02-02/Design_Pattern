package strategy_Design.strategies;

import strategy_Design.strategy_interface.PaymentStrategy;

/**
 *  <p>This is one of the concrete strategy class for <code>UPI Payments</code> </p>
 */
public class UpiPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(long amount) {
        System.out.println("Paid using UPI " + amount);
    }
}
