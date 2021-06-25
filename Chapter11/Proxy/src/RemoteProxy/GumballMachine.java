package RemoteProxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private static final long serialVersionUID = 2L;

    State soldOutState;
    State soldState;
    State hasQuarterState;
    State noQuarterState;
    State winnerState;

    State state;
    int count;
    String location;

    public GumballMachine(String location, int numberOfGumballs) throws RemoteException {
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        winnerState = new WinnerState(this);

        count = numberOfGumballs;
        if (count > 0) state = noQuarterState;
        else state = soldOutState;

        this.location = location;
    }

    public String getLocation() { return location; }
    public void insertQuarter() { state.insertQuarter(); }
    public void ejectQuarter() { state.ejectQuarter(); }
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    public void setState(State state) { this.state = state; }
    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) count--;
    }

    public int getCount() { return count; }
    public State getSoldOutState() { return soldOutState; }
    public State getSoldState() { return soldState; }
    public State getHasQuarterState() { return hasQuarterState; }
    public State getNoQuarterState() { return noQuarterState; }
    public State getWinnerState() { return winnerState; }

    public void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; its new count is " + getCount());
        state.refill();
    }

    public State getState() {
        return state;
    }

    public String toString() {
        return "\n\"Gumballs-2-Go\"\n" +
                "Java-enabled standing Model #2021-3\n" +
                "Inventory: " + getCount() + "\n" +
                state + "\n";
    }
}
