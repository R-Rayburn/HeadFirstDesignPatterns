package Receiver;

public class Stereo {
    public enum Setting {
        CD,
        DVD,
        RADIO
    }
    String location = "";
    Setting setting;
    boolean isOn;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        isOn = true;
        System.out.println(location + " stereo is on");
    }

    public void off() {
        isOn = false;
        System.out.println(location + " stereo is off");
    }

    public void setCd() {
        setting = Setting.CD;
        System.out.println(location + " stereo is set for CD");
    }

    public void setDvd() {
        setting = Setting.DVD;
        System.out.println(location + " stereo is set for DVD");
    }

    public void setRadio() {
        setting = Setting.RADIO;
        System.out.println(location + " stereo is set for Radio");
    }

    public void setVolume(int volume) {
        if (volume > 11)
            System.out.println(location + " stereo volume is set to max volume");
        else if (volume < 0)
            System.out.println(location + " stereo volume is set to 0");
        else
            System.out.println(location + " stereo volume is set to " + volume);
    }

    public Setting getSetting() {
        return setting;
    }

    public boolean isOn() {
        return isOn;
    }
}
