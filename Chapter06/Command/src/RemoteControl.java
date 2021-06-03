import Command.Command;
import Command.NoCommand;

import java.util.*;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Deque<Command> undoCommand = new ArrayDeque<>();

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (slot < 0 || slot > onCommands.length)
            printMissingSlotMessage(slot);
        else {
            onCommands[slot] = onCommand;
            offCommands[slot] = offCommand;
        }
    }

    public void removeCommand(int slot) {
        if (slot < 0 || slot > onCommands.length)
            printMissingSlotMessage(slot);
        else {
            onCommands[slot] = new NoCommand();
            offCommands[slot] = new NoCommand();
        }
    }

    public void onButtonWasPushed(int slot) {
        if (slot < 0 || slot > onCommands.length)
            printMissingSlotMessage(slot);
        else {
            onCommands[slot].execute();
            undoCommand.add(onCommands[slot]);
        }
    }

    public void offButtonWasPushed(int slot) {
        if (slot < 0 || slot > offCommands.length)
            printMissingSlotMessage(slot);
        else {
            offCommands[slot].execute();
            undoCommand.add(offCommands[slot]);
        }
    }

    private void printMissingSlotMessage(int slot) {
        System.out.println("Slot " + slot + " does not exist");
    }

    public void undoButtonWasPushed() {
        undoCommand.pop().undo();
//        if (undoCommand.size() > 0) {
//            Command undo = undoCommand.remove(undoCommand.size() - 1);
//            undo.undo();
//        }
//        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder
                    .append("[slot ").append(i).append("] ")
                    .append(parseName(onCommands[i].getClass().getName()))
                    .append("    ")
                    .append(parseName(offCommands[i].getClass().getName()))
                    .append("\n");
        }
        stringBuilder.append("Command Hist:\n");
        for (Command command : undoCommand) {
            stringBuilder
                    .append("    ")
                    .append(parseName(command.getClass().getName()))
                    .append("\n");
        }
        return stringBuilder.toString();
    }

    private String parseName(String className) {
        String name = className;
        int lastIndex = name.lastIndexOf('.') + 1;
        if (lastIndex > 0)
            name = className.substring(lastIndex);
        return name;
    }
}
