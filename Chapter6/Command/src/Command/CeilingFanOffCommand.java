package Command;

import Receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {
    CeilingFan fan;
    CeilingFan.Level previousSpeed;

    public CeilingFanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }

    public void execute() {
        previousSpeed = fan.getLevel();
        fan.off();
    }

    public void undo() {
        if (previousSpeed == CeilingFan.Level.HIGH)
            fan.high();
        else if (previousSpeed == CeilingFan.Level.MEDIUM)
            fan.medium();
        else if (previousSpeed == CeilingFan.Level.LOW)
            fan.low();
        else if (previousSpeed == CeilingFan.Level.OFF)
            fan.off();
    }
}
