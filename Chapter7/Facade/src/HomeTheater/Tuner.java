package HomeTheater;

public class Tuner {
    String description;
    Amplifier amp;
    double frequency;

    public Tuner(String description, Amplifier amp) {
        this.description = description;
        this.amp = amp;
    }

    public void on() { System.out.println(description + " is on"); }

    public void off() { System.out.println(description + " is off"); }

    public void setAm() { System.out.println(description + " set for AM"); }

    public void setFm() { System.out.println(description + " set for FM"); }

    public void setFrequency(double frequency) {
        System.out.println(description + " setting frequency to " + frequency);
        this.frequency = frequency;
    }

    public String toString() { return description; }
}
