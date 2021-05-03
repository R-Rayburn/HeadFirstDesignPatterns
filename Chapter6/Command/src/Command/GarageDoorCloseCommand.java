package Command;

import Receiver.GarageDoor;

public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();
        garageDoor.lightOff();
    }

    public void undo() {
        garageDoor.lightOn();
        garageDoor.up();
    }
}
