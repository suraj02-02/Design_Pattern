package decorator_Design;

import decorator_Design.basecomponents.Burger;
import decorator_Design.basecomponents.TandooriBurger;
import decorator_Design.decorators.CheeseDecorator;
import decorator_Design.decorators.MayoniseDecorator;
import decorator_Design.decorators.PaneerPattyDecorator;

/**
 *  This is a demonstration of <code>Decorator Design Pattern</code>
 */

public class Client {

    public static void main(String[] args) {

        /**
         *   The Decorator Design Pattern is a structural design pattern that allows you to dynamically add responsibilities to an object.
         *    It is basically addition of behaviour as layers to the original object without affecting the original object and class.
         *    It involves a set of decorator classes that are used to wrap concrete components. This wrapping allows for the dynamic addition of responsibilities or behaviors to an object at runtime.
         *
         *    Components Involved :
         *       1. Component : @see {@link decorator_Design.basecomponents.Burger}
         *       2.Concrete Component : @see {@link decorator_Design.basecomponents.TandooriBurger} ,
         *                                                 @see {@link decorator_Design.basecomponents.ChickenBurger} ,
         *                                                @see {@link decorator_Design.basecomponents.ZingerBurger}
         *
         *       3.Decorator : @see {@link decorator_Design.decorators.BurgerDecorator}
         *       4.Concrete Decorator : @see {@link decorator_Design.decorators.CheeseDecorator} ,
         *                                              @see {@link decorator_Design.decorators.MayoniseDecorator} ,
         *                                             @see {@link decorator_Design.decorators.PaneerPattyDecorator}
         *
         *    Use cases :
         *       1. Logging
         *       2. Caching
         *       3. Authentication
         *       4. Performance Monitoring
         *       5.Pizza , KFC Vendor systems
         *
         *     Problem Statement : We are a Burger Vendor where we need to add features to our burger such as add toppings ,  cheese and patties etc.
         *     Solution : Here we will be using <code>Decorator Pattern</code> to solve this problem.
         *
         *     As per the below solution we can see , using Decorator Pattern we can add features to our burger dynamically.
         *     No changes were required to the original object. It just works like layering the object on top of it.
         *
         */

         // Ordering Tandoori Burger
        Burger burger = new TandooriBurger();
        System.out.println(burger.getDescription());
        System.out.println("Total Cost : " +  burger.getCost());

        // Addding mayonise
        MayoniseDecorator mayoniseDecorator = new MayoniseDecorator(burger);
        System.out.println(mayoniseDecorator.getDescription());
        System.out.println("Total Cost : " +  mayoniseDecorator.getCost());

        // Adding paneer patty
        PaneerPattyDecorator paneerPattyDecorator = new PaneerPattyDecorator(mayoniseDecorator);
        System.out.println(paneerPattyDecorator.getDescription());
        System.out.println("Total Cost : " +  paneerPattyDecorator.getCost());

        // Adding cheese
        CheeseDecorator cheeseDecorator = new CheeseDecorator(paneerPattyDecorator);
        System.out.println(cheeseDecorator.getDescription());
        System.out.println("Total Cost : " +  cheeseDecorator.getCost());

    }
}
