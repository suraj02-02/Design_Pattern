package decorator_Design.basecomponents;

public class ChickenBurger extends Burger {

    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public String getDescription() {
        return "Your Chicken Burger is Ready";
    }

    @Override
    public int getCost() {
        return 270;
    }
}
