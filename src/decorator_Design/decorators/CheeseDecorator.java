package decorator_Design.decorators;

import decorator_Design.basecomponents.Burger;

/**
 *  This is one of the concrete decorator class for <code>Cheese Burger</code>
 */

public class CheeseDecorator extends BurgerDecorator {

    private Burger burger;

    public CheeseDecorator(Burger burger) {
           this.burger = burger;
    }

    @Override
    public String getName() {
        return burger.getName();
    }

    @Override
    public String getDescription() {
        return "We have added cheese toping to your burger";
    }

    @Override
    public int getCost() {
        return burger.getCost() + 50;
    }
}
