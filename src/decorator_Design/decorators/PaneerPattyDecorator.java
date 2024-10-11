package decorator_Design.decorators;

import decorator_Design.basecomponents.Burger;

/**
 * This is one of the concrete decorator class for <code>PaneerPatty</code>
 */

public class PaneerPattyDecorator extends BurgerDecorator {

    private Burger burger;;

    public PaneerPattyDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getName() {
        return burger.getName();
    }

    @Override
    public String getDescription() {
        return "We have added paneer patty to your burger";
    }

    @Override
    public int getCost() {;
        return burger.getCost() + 80;
    }

}
