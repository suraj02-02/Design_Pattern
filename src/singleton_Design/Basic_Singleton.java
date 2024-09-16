package singleton_Design;

/**
 * Singleton is the most basic design pattern.
 * As the name suggest having a singleton class design will allow only single instance / Object of that class in the Heap Area
 *
 * <p>
 * Use case :
 *   1. Object Pooling -> Whenever an instance of a class is expensive to create and its attributes are such that the state change is not required
 *      then those classes / impl are preferred to be made as singleton in design.
 *      Ex : Database connection pool classes , ObjectMapper instances etc.
 * </p>
 *
 *
 *
 *
 */

public class Basic_Singleton {

    private static final Basic_Singleton INSTANCE = new Basic_Singleton();

    private Basic_Singleton(){}

    public static Basic_Singleton getINSTANCE() {
        return INSTANCE;
    }
}
