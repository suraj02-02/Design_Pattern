package command_Design.receiver;

/**
 * <p>
 *    This is called <code>Receiver Component</code> in <code>Command Pattern.</code>
 *    Whenever we pass a command to <code>Invoker</code> it will be passed to <code>Receiver</code> through <code>Command layers</code>
 * </p>
 * <p>
 *     Contains the actual business logic that needs to be performed when the command is executed.
 * </p>
 */

public class AirConditioner {

    private boolean isOn;
    private int temperature;

    public AirConditioner(boolean isActive, int temperature) {
        this.isOn = isActive;
        this.temperature = temperature;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println("Air conditioner turned on");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("Air conditioner turned off");
    }

    public void setTemperature() {
        System.out.println("Air conditioner temperature set to " + this.temperature);
    }
}
