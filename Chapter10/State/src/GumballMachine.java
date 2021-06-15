public class GumballMachine {

    State soldOutState;
    State soldState;
    State hasQuarterState;
    State noQuarterState;
    State winnerState;

    State state;
    int count;

    public GumballMachine(int numberOfGumballs) {
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        winnerState = new WinnerState(this);

        count = numberOfGumballs;
        if (count > 0) state = noQuarterState;
        else state = soldOutState;
    }

    public void insertQuarter() { state.insertQuarter(); }
    public void ejectQuarter() { state.ejectQuarter(); }
    public void turnCrank() {
        state.turnCrank();
        // TODO: This always runs, even if there is no quarter.
        //   Need to implement some sort of exception to
        //    verify a valid state to dispense.
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

    public String toString() {
        return "\n\"Gumballs-2-Go\"\n" +
                "Java-enabled standing Model #2021-3\n" +
                "Inventory: " + getCount() + "\n" +
                state + "\n";
    }
}
