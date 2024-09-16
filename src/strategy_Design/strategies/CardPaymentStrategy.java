package strategy_Design.strategies;

import strategy_Design.strategy_interface.PaymentStrategy;

/**
 *  <p>This is one of the concrete strategy class for <code>Card Payments</code> </p>
 */
public class CardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(long amount) {
         System.out.println("Paid Using Card " + amount);
    }
}
