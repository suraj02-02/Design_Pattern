package facade_Design;

/**
 * <p>
 *     This is one of the subsystems for <code>Facade Design Pattern</code>
 * </p>
 * <p>
 *     Client will interact with this subsystem through <code>Facade</code>
 * </p>
 */
public class SoundSystem {

    public void on() {
        System.out.println("Sound System Turned On....");
    }

    public void off() {
        System.out.println("Sound System Turned Off....");
    }

    public void adjustVolume(int volumeLevel) {
        System.out.println("Adjusting Volume to : " + volumeLevel);
    }
}
