package HomeTheater;

public class PopcornPopper {
    String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " is on");
    }

    public void off() {
        System.out.println(description + " is off");
    }

    public void pop() {
        System.out.println(description + " popping popcorn");
    }

    public String toString() { return description; }
}
