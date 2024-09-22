package command_Design.command;

import command_Design.receiver.AirConditioner;


/**
 * <p>
 *  This is a concrete command class for <code>Command Pattern</code>
 *  It will be implemented by concrete command classes each having their own implementation of execute method
 * </p>
 * <p>
 *   Consider this as a middleware between invoker and receiver.
 *   It creates a layer of abstraction and decouples the client from the concrete implementation of receiver.
 * </p>
 *
 */
public class SetTempratureCommand implements ICommand {

    // reference of receiver
    private final AirConditioner airConditioner;

    //
    public SetTempratureCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
         airConditioner.setTemperature();
    }
}
