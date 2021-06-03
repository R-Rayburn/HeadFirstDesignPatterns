package Receiver;

public class Light {
    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + " light is on");
    }

    public void off() {
        System.out.println(this.location + " light is off");
    }
}
