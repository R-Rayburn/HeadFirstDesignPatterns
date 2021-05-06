package HomeTheater;

public class Projector {
    String description;
    StreamingPlayer player;

    public Projector(String description, StreamingPlayer player) {
        this.description = description;
        this.player = player;
    }

    public void on() {
        System.out.println(description + " is on");
    }

    public void off() {
        System.out.println(description + " is off");
    }

    public void tvMode() {
        System.out.println(description + " in tv mode (4:3 aspect ratio)");
    }

    public void wideScreenMode() {
        System.out.println(description + " in wide screen mode (16:9 aspect ratio");
    }

    public String toString() { return description; }
}
