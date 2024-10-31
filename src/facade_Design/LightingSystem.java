package facade_Design;

/**
 * <p>
 *     This is one of the subsystems to manage lighting for <code>Facade Design Pattern</code>
 * </p>
 * <p>
 *     Client will interact with this subsystem through <code>Facade</code>
 * </p>
 */
public class LightingSystem {

    public void dim() {
        System.out.println("Dimming the lights....");
    }

    public void unDim() {
        System.out.println("Lights Turned On....");
    }
}
