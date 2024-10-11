package decorator_Design.decorators;

import decorator_Design.basecomponents.Burger;

public class MayoniseDecorator extends BurgerDecorator {

    private Burger burger;;

    public MayoniseDecorator (Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getName() {
        return burger.getName();
    }

    @Override
    public String getDescription() {
        return "We have added mayonise to your burger";
    }

    @Override
    public int getCost() {
        return burger.getCost() + 20;
    }

}
