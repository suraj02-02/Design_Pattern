package facade_Design;

/**
 * <p>This is a demonstration for <code>Facade Design Pattern</code></p>
 */
public class Client {

    public static void main(String[] args) {

        /**
         *  Facade Design Pattern is a structural design pattern that provides a simplified interface to a complex system.
         *  It is used to simplify the client code by hiding the complexity of the system.
         *  Systems which interacts with number of different classes can be implemented using this pattern.
         *
         *  So , instead of having different interfaces we can use a single interface which is <code>Facade</code> and will act as interface for any client interaction with the system.
         *  This pattern is generally implemented in complex subsystems having multiple interfaces and multiple classes and we want to hide the complexity of the system.
         *  Now instead of communicating with multiple sub systems the client can communicate with the <code>Facade</code>
         *
         *  Components Involved :
         *     1. Facade : @see {@link HomeTheaterFacade}
         *     2. Subsystems : @see {@link DvdSystem} , @see {@link ProjectorSystem} , @see {@link LightingSystem} , @see {@link SoundSystem}
         *
         *  Problem Statement : We will be implementing a Home Theater System using Facade Design Pattern
         *
         */

        // Creating subsystems
        LightingSystem lightingSystem = new LightingSystem();
        ProjectorSystem projectorSystem = new ProjectorSystem();
        SoundSystem soundSystem = new SoundSystem();
        DvdSystem dvdSystem = new DvdSystem();

        // Creating Facade
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdSystem, projectorSystem, lightingSystem, soundSystem);
        /**
         *  Client will interact with different subsystems through this <code>Facade</code>
         *  Just calling the #{@link HomeTheaterFacade#watchMovie(String)} method will start the theater
         */
        homeTheaterFacade.watchMovie("Star Wars");
        System.out.println("\n");

        /**
         *  Just calling the #{@link HomeTheaterFacade#endMovie()}} method will stop the theater
         */
        homeTheaterFacade.endMovie();
    }
}
