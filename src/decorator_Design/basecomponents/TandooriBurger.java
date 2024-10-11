package decorator_Design.basecomponents;

public class TandooriBurger extends Burger{

    @Override
    public String getName() {
        return "Tandoori Burger";
    }

    @Override
    public String getDescription() {
        return "Your Tandoori Burger is ready";
    }

    @Override
    public int getCost() {
        return 180;
    }
}
