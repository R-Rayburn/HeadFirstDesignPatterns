package Command;

import Receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.lightOn();
        garageDoor.up();
    }

    public void undo() {
        garageDoor.down();
        garageDoor.lightOff();
    }
}
