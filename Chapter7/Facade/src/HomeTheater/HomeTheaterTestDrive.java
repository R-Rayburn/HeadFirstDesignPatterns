package HomeTheater;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Theater Amp");
        Tuner tuner = new Tuner("Tuner", amp);
        StreamingPlayer player = new StreamingPlayer(amp, "Disney+");
        Projector projector = new Projector("Projector", player);
        Screen screen = new Screen("Drop Screen");
        TheaterLights lights = new TheaterLights("Receded Lights");
        PopcornPopper popper = new PopcornPopper("Popper3000");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, popper, projector, screen, player, lights, tuner);

        homeTheater.watchMovie("The Mandalorian");
        player.play(4);
        homeTheater.endMovie();
    }
}
