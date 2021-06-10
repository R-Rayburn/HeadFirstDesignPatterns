package Receiver;

public class GarageDoor {
    String location = "";
    Light light;

    public GarageDoor(String location) {
        this.location = location;
        light = new Light(location + " Garage");
    }

    public void up() {
        System.out.println(location + " garage door open");
    }

    public void down() {
        System.out.println(location + " garage door closed");
    }

    public void stop() {
        System.out.println("Stopping " + location + " garage door");
    }

    public void lightOn() {
        light.on();
    }

    public void lightOff() {
        light.off();
    }
}
