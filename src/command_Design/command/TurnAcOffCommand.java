package command_Design.command;

import command_Design.receiver.AirConditioner;

public class TurnAcOffCommand implements ICommand {

    // receiver
    private final AirConditioner airConditioner;

    public TurnAcOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();
    }
}
