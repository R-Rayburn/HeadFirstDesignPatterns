public class GumballMachine {

    State soldOutState;
    State soldState;
    State hasQuarterState;
    State noQuarterState;

    State state;
    int count = 0;

    public GumballMachine(int numberOfGumballs) {
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);

        count = numberOfGumballs;
        if (count > 0) state = noQuarterState;
        else state = soldOutState;
    }

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

}
