package HomeTheater;

public class Amplifier {
    String description;
    Tuner tuner;
    StreamingPlayer player;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " is on");
    }

    public void off() {
        System.out.println(description + " is off");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println(description + " setting streaming player to " + player);
        this.player = player;
    }

    public void setStereoSound() {
        System.out.println(description + " surround sound on (5 speakers & 1 subwoofer)");
    }

    public void setTuner(Tuner tuner) {
        System.out.println(description + " setting tuner to " + tuner);
        this.tuner = tuner;
    }

    public void setVolume(int volume) {
        System.out.println(description + " setting volume to " + volume);
    }

    public String toString() {
        return description;
    }

}
