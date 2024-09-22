package command_Design.invoker;

import command_Design.command.ICommand;

/**
 * <p>
 *  This is the <code>Invoker Component</code> in <code>Command Pattern</code>.
 *  It is basically a way to transmit your commands to your receiver.
 * </p>
 * <p>
 * Responsible for triggering the command. It doesn't need to know what the command does, only how to trigger it.
 * </p>
 */

public class RemoteControl {

      private ICommand command;

      public void setCommand(ICommand command) {
          this.command = command;
      }

      public void pressButton() {
          command.execute();
      }
}
