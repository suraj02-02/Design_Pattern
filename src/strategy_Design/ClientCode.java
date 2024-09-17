package strategy_Design;

import strategy_Design.context.PaymentProcessor;
import strategy_Design.strategies.CardPaymentStrategy;
import strategy_Design.strategies.CashPaymentStrategy;
import strategy_Design.strategies.UpiPaymentStrategy;
import strategy_Design.strategy_interface.PaymentStrategy;
import strategy_Design.utils.MapBasedStrategySelection;

import java.util.Scanner;

/**
 * <p>
 *     We will be demonstrating the <code>Strategy Design Pattern</code>
 *      @see <a href="https://refactoring.guru/design-patterns/strategy">Strategy Design Pattern Article </a> for detailed information.
 * </p>
 */

public class ClientCode {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {

        /**
         *  Strategy Pattern is a behavioral design pattern that allows selecting one from multiple algorithm at runtime based on some user defined parameter or business logic.
         *
         *  Applicability :
         *        - Use the Strategy pattern when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.
         *        - Use the Strategy when you have a lot of similar classes that only differ in the way they execute some behavior.
         *        - Use the pattern when your class has a massive conditional statement that switches between different variants of the same algorithm.
         *
         *  Problem : We are a payment processor and we accept different payment modes @see {@link strategy_Design.utils.PaymentMode}.
         *                   We need the code to be extensible and maintainable such that we can add new payment modes in future easiily.
         *
         *  Solution : Here we will be using <code>Strategy Pattern</code> whose main use case is to make runtime decision on which strategy to use.
         *
         *   Components we have while building the code using <code>Strategy Pattern</code>
         *        1. Context -  @see {@link PaymentProcessor}
         *        2. Strategy - @see {@link strategy_Design.strategy_interface.PaymentStrategy}
         *        3. Concrete Strategy - @see {@link CardPaymentStrategy} , {@link  UpiPaymentStrategy} , {@link CashPaymentStrategy} - Here , the implementation of the behaviour defined in Strategy interface is done.
         *             If in future any new payment mode is added  then we can add a new Concrete strategy for it and the strategy interface will be implemented.
         *
         *
         *  One more classical problem faced in Strategy Pattern which is :
         *
         *  How to decide which Concrete Strategy is to be used , although if else block can be used but
         *  it can lead to tight coupling and maintainence issues.
         *
         *  Solution :
         *     1. Factory Pattern - A factory method can be created and based on some input param the concrete strategy can be decided using simple switch statements
         *     2. Dependency Injection
         *     3. Map Based Strategy selection - Explained below with code example
         *     4. Annotation based selection - Each concrete class will have a annotation and that annotation will be used to decide the concrete strategy,
         *
         */

         System.out.println("Welcome to Payment Processor!");
        // Map Based selection approach for deciding which strategy to use
         final PaymentStrategy paymentStrategy = MapBasedStrategySelection.getPaymentStrategy(getSelectedPaymentMode());
         processPayment(paymentStrategy);
    }

    private static void processPayment(PaymentStrategy paymentStrategy) {
        final PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.pay(getAmount());
    }

    private static long getAmount() {
        System.out.println("Please enter the amount you want to pay");
        return scanner.nextLong();
    }

    private static int getSelectedPaymentMode() {
             System.out.println("Please choose your payment mode \n 1. Card \n 2. UPI \n 3. Cash");
             return scanner.nextInt();
    }

}
