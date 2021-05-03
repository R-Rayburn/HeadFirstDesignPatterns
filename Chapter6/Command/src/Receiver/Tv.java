package Receiver;

public class Tv {
    String location = "";

    public Tv(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " tv is on");
    }

    public void off() {
        System.out.println(location + " tv is off");
    }
}
