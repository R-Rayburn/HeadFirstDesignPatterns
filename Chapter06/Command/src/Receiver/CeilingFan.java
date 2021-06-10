package Receiver;

public class CeilingFan {
    public enum Level {
        OFF,
        LOW,
        MEDIUM,
        HIGH
    }

    String location = "";
    Level level;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        level = Level.HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    public void medium() {
        level = Level.MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        level = Level.LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    public void off() {
        level = Level.OFF;
        System.out.println(location + " ceiling fan is off");
    }

    public Level getLevel() {
        return level;
    }
}
