package strategy_Design;

import strategy_Design.context.PaymentProcessor;
import strategy_Design.strategies.CardPaymentStrategy;
import strategy_Design.strategies.CashPaymentStrategy;
import strategy_Design.strategies.UpiPaymentStrategy;

public class ClientCode {

    public static void main(String[] args)  {

        /**
         *  Based on the Concrete strategy passed to the payment processor ,
         *  the specific {@link PaymentProcessor#pay(long)} function will be invoked
         */

        // payment made through card
        PaymentProcessor paymentProcessor = new PaymentProcessor(new CardPaymentStrategy());
        paymentProcessor.pay(2500);

        // payment made through cash
        paymentProcessor.setPaymentStrategy(new CashPaymentStrategy());
        paymentProcessor.pay(3500);

        // payment made through UPI
        paymentProcessor.setPaymentStrategy(new UpiPaymentStrategy());
        paymentProcessor.pay(4500);

        /**
         *  Here , is one more classical problem faced in Strategy Pattern which is :
         *
         *  How to decide which Concrete Strategy is to be used , although if else block can be used but
         *  it can lead to tight coupling and maintainence issues.
         *
         *  Solution :
         *     1. Factory Pattern - A factory method can be created and based on some input param the concrete strategy can be decided using simple switch statements
         *     2. Dependency Injection
         *     3. Map Based Strategy selection - Explained below with code example
         *     4.
         *
         *
         */



    }

}
