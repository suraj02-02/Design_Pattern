package strategy_Design.utils;

import strategy_Design.strategies.CardPaymentStrategy;
import strategy_Design.strategies.CashPaymentStrategy;
import strategy_Design.strategies.UpiPaymentStrategy;
import strategy_Design.strategy_interface.PaymentStrategy;

import java.util.Map;

/** <p>
 *      This is a <code>Map Based Strategy Selection</code> approach for making runtime decision on which strategy to use
 *  </p>
 */

public class MapBasedStrategySelection {

         public static final Map<PaymentMode , PaymentStrategy> strategyMap;
         private static final Map<Integer , PaymentMode> paymentModeMap ;

         static {
               strategyMap = Map.of(
                       PaymentMode.CARD ,   new CardPaymentStrategy(),
                       PaymentMode.CASH ,  new CashPaymentStrategy(),
                       PaymentMode.UPI ,    new UpiPaymentStrategy()
               );
               paymentModeMap = Map.of(
                       1,  PaymentMode.CARD,
                       2, PaymentMode.UPI,
                       3, PaymentMode.CASH
               );
         }

         public static PaymentStrategy getPaymentStrategy(final int modeSelected){

             if(modeSelected > paymentModeMap.size()){
                      throw new IllegalArgumentException("Invalid payment mode selected");
             }

             final PaymentMode paymentMode = paymentModeMap.get(modeSelected);
             return strategyMap.get(paymentMode);
         }

}
