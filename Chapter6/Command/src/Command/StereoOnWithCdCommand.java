package Command;

import Receiver.Stereo;

public class StereoOnWithCdCommand implements Command {
    Stereo stereo;
    Stereo.Setting previousSetting;
    boolean wasOn;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        previousSetting = stereo.getSetting();
        wasOn = stereo.isOn();
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    public void undo() {
        if (!wasOn)
            stereo.off();
        else if (previousSetting == Stereo.Setting.CD)
            stereo.setCd();
        else if (previousSetting == Stereo.Setting.DVD)
            stereo.setDvd();
        else if (previousSetting == Stereo.Setting.RADIO)
            stereo.setRadio();
    }
}
