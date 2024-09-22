package command_Design.command;

import command_Design.receiver.AirConditioner;

public class TurnAcOnCommand implements ICommand {

    private final AirConditioner airConditioner;

    public TurnAcOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }
}
