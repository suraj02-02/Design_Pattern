package strategy_Design.strategy_interface;

/**
 *  <p>
 *      Strategy interface which is implemented by all the concrete strategies
 *  </p>
 *  <p>
 *      Based on the <code>strategy</code> passed to the {@link strategy_Design.context.PaymentProcessor} the request will be delegated
 *      to appropirate <code>Concrete Strategy</code>
 *  </p>
 *
 */

@FunctionalInterface
public interface PaymentStrategy {

    void pay(long amount);
}
