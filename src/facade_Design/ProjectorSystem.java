package facade_Design;

/**
 * <p>
 *     This is one of the subsystems for <code>Facade Design Pattern</code>
 * </p>
 * <p>
 *     Client will interact with this subsystem through <code>Facade</code>
 * </p>
 */
public class ProjectorSystem {

     public void turnOn() {
         System.out.println("Projector Turned On....");
     }

     public void turnOff() {
         System.out.println("Projector Turned Off....");
     }

     public void setInput(String input){
         System.out.println("Setting Input to : " + input);
     }
}
