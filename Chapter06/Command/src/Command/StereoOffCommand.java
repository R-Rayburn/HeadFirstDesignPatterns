package Command;

import Receiver.Stereo;

public class StereoOffCommand  implements Command {
    Stereo stereo;
    Stereo.Setting previousSetting;
    boolean wasOn;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        previousSetting = stereo.getSetting();
        wasOn = stereo.isOn();
        stereo.off();
    }

    public void undo() {
        if (wasOn)
            stereo.on();
        if (previousSetting == Stereo.Setting.CD) {
            stereo.setCd();
        } else if (previousSetting == Stereo.Setting.DVD) {
            stereo.setDvd();
        } else if (previousSetting == Stereo.Setting.RADIO) {
            stereo.setRadio();
        }
    }
}
