package decorator_Design.basecomponents;

public class ZingerBurger extends Burger {

    @Override
    public String getName() {
        return "Zinger Burger";
    }

    @Override
    public String getDescription() {
        return "Your Zinger Burger is Ready";
    }

    @Override
    public int getCost() {
        return 220;
    }
}
