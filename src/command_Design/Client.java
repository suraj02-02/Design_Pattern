package command_Design;

import command_Design.command.ICommand;
import command_Design.command.SetTempratureCommand;
import command_Design.command.TurnAcOffCommand;
import command_Design.command.TurnAcOnCommand;
import command_Design.invoker.RemoteControl;
import command_Design.receiver.AirConditioner;

/**
 *  This is a demonstration of <code>Command Design Pattern</code>
 *  @see <a href="https://www.baeldung.com/java-command-pattern">Command Design Pattern Article </a> for detailed information.
 *  @see <a href="https://www.baeldung.com/java-command-pattern">Command Design Pattern Article </a> for detailed information.
 *  @see <a href="https://stackoverflow.com/questions/32597736/why-should-i-use-the-command-design-pattern-while-i-can-easily-call-required-met">
 *      Command Design Pattern - Why should I use the Command Design Pattern while I can easily call required methods </a> for detailed information.
 */

public class Client {

    public static void main(String[] args) {

        /**
         *   The Command Design Pattern is a behavioral design pattern used to encapsulate a request as an object, thereby allowing you to
         *   parameterize clients with different requests, queue or log requests, and support undoable operations.
         *   It decouples the object that invokes the operation from the one that knows how to perform it, promoting flexibility in executing commands.
         *
         *   ##Client calls -> Invoker --> Sends Command --> Receiver
         *
         *   Applicability :
         *     1.Use the Command pattern when you want to queue operations, schedule their execution, or execute them remotely.
         *     2.Use the Command pattern when you want to implement undoable operations. (Undo / Redo features)
         *
         *   Problem Statement : We are designing an application where we want to control the Home-Appliances (Here , Air conditioner).
         *                       We need the code to be extensible and maintainable such that we can add new appliances in future easily.
         *
         *   Solution : Here we will be using Command Pattern for solving this problem.
         *
         *   ##Keys components involved while building the code using <code>Command Pattern</code> :
         *
         *   1.Command -  @see {@link ICommand}
         *   2.Concrete Command - @see {@link SetTempratureCommand} , {@link TurnAcOnCommand} , {@link TurnAcOffCommand}
         *   2.Invoker - @see {@link RemoteControl}
         *   3.Receiver - @see {@link AirConditioner}
         *   4.Client - @see {@link Client}
         *
         *  */

        // Setting up receiver
        AirConditioner airConditioner = new AirConditioner(false , 24);
        // Setting up invoker
        RemoteControl remoteControl = new RemoteControl();


        // Setting up commands and sending them to invoker
        ICommand turnOnCommand = new TurnAcOnCommand(airConditioner);
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();

        ICommand turnOffCommand = new TurnAcOffCommand(airConditioner);
        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();

        ICommand setTempCommand = new SetTempratureCommand(airConditioner);
        remoteControl.setCommand(setTempCommand);
        remoteControl.pressButton();

    }
}
