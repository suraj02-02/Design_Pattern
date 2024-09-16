package strategy_Design.strategies;

import strategy_Design.strategy_interface.PaymentStrategy;

/**
 * <p>This is one of the concrete strategy class for <code>Cash Payments</code> </p>
 */
public class CashPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(long amount) {
        System.out.println("Paid using Cash " + amount);
    }
}
