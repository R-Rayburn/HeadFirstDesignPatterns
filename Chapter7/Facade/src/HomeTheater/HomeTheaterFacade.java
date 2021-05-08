package HomeTheater;

public class HomeTheaterFacade {
    Amplifier amp;
    PopcornPopper popcornPopper;
    Projector projector;
    Screen screen;
    StreamingPlayer player;
    TheaterLights lights;
    Tuner tuner;

    public HomeTheaterFacade(Amplifier amp,
                             PopcornPopper popcornPopper,
                             Projector projector,
                             Screen screen,
                             StreamingPlayer player,
                             TheaterLights lights,
                             Tuner tuner) {
        this.amp = amp;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.player = player;
        this.lights = lights;
        this.tuner = tuner;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparing to watch movie...");
        popcornPopper.on();
        popcornPopper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(player);
        amp.setStereoSound();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting theater down...");
        popcornPopper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }

    public void listenToRadio(double frequency) {
        System.out.println("Tuning in to radio...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    public void endRadio() {
        System.out.println("Turning off radio...");
        tuner.off();
        amp.off();
    }
}
