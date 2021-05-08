package HomeTheater;

public class StreamingPlayer {
    String description;
    int currentChapter;
    Amplifier amp;
    String movie;

    public StreamingPlayer(Amplifier amp, String description) {
        this.amp = amp;
        this.description = description;
    }

    public void on() { System.out.println(description + " is on"); }

    public void off() { System.out.println(description + " is off"); }

    public void pause() { System.out.println(description + " paused \"" + movie + "\""); }

    public void play(String movie) {
        this.movie = movie;
        currentChapter = 0;
        System.out.println(description + " playing \"" + this.movie + "\"");
    }

    public void play(int chapter) {
        if (movie == null)
            System.out.println(description + " can't play chapter " + chapter + ", no movie selected");
        else {
            currentChapter = chapter;
            System.out.println(description + " playing chapter " + currentChapter + " of \"" + movie + "\"");
        }
    }

    public void setSurroundAudio() {
        amp.setStereoSound();
        // System.out.println(description + " set to surround audio");
    }

    public void setTwoChannelAudio() {
        System.out.println(description + " set two channel audio");
        amp.setVolume(24);
    }

    public void stop() { System.out.println(description + " stopped \"" + movie + "\""); }

    public String toString() { return description; }
}
