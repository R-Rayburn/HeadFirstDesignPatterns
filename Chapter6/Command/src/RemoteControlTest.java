import Command.GarageDoorOpenCommand;
import Command.LightOnCommand;
import Receiver.GarageDoor;
import Receiver.Light;

// This is the "Client"
public class RemoteControlTest {
    public static void main(String[] args) {
        // Invoker
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // Receiver
        Light light = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("Connected");
        // Command
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}
