package facade_Design;

/**
 * <p>
 *     This is one of the subsystems for <code>Facade Design Pattern</code>
 * </p>
 * <p>
 *     Client will interact with this subsystem through <code>Facade</code>
 * </p>
 */

public class DvdSystem {

    public void turnOn() {
        System.out.println("Dvd Turned On....");
    }

    public void turnOff() {
        System.out.println("Dvd Turned Off....");
    }

    public void play() {
        System.out.println("Playing Movie....");
    }

    public void stop() {
        System.out.println("Stopped Playing Movie....");
    }
}
