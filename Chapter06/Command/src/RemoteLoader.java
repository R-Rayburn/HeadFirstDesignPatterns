import Command.*;
import Receiver.*;

public class RemoteLoader {
    public static void main(String[] arg) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan livingRoomFan = new CeilingFan("Living Room");
        GarageDoor exteriorGarage = new GarageDoor("Exterior");
        Stereo bedroomStereo = new Stereo("Bedroom");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnHighCommand livingRoomCeilingFanOnHigh = new CeilingFanOnHighCommand(livingRoomFan);
        CeilingFanOnMediumCommand livingRoomCeilingFanOnMedium = new CeilingFanOnMediumCommand(livingRoomFan);
        CeilingFanOffCommand livingRoomCeilingFanOff = new CeilingFanOffCommand(livingRoomFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(exteriorGarage);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(exteriorGarage);

        StereoOnWithCdCommand bedroomStereoOnWithCd = new StereoOnWithCdCommand(bedroomStereo);
        StereoOffCommand bedroomStereoOff = new StereoOffCommand(bedroomStereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, livingRoomCeilingFanOnHigh, livingRoomCeilingFanOff);
        remoteControl.setCommand(3, garageDoorOpen, garageDoorClose);
        remoteControl.setCommand(4, bedroomStereoOnWithCd, bedroomStereoOff);
        remoteControl.setCommand(5, livingRoomCeilingFanOnMedium, livingRoomCeilingFanOff);

        // Example of setting commands using lambda expression and method reference.
        // This would allow the command classes to be disposed of.
        // Only works if the command interface has only one abstract method.
        // remoteControl.setCommand(5, () -> livingRoomFan.medium(), livingRoomFan::off);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(4);
        remoteControl.onButtonWasPushed(4);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);

        // Testing the Macro Command
        Light light = new Light("Living Room");
        Tv tv = new Tv("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        TvOnCommand tvOn = new TvOnCommand(tv);
        TvOffCommand tvOff = new TvOffCommand(tv);
        StereoOnWithCdCommand stereoOn = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = { lightOn, tvOn, stereoOn, hottubOn };
        Command[] partyOff = { lightOff, tvOff, stereoOff, hottubOff };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Party On ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Party Off ---");
        remoteControl.offButtonWasPushed(0);
    }
}
