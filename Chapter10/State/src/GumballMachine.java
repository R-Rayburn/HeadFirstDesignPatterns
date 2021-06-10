public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) state = NO_QUARTER;
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) System.out.println("You can't insert another quarter.");
        else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        }
        else if (state == SOLD_OUT) System.out.println("You can't insert a quarter, the machine is sold out.");
        else if (state == SOLD) System.out.println("Please wait, your gumball is on its way.");
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        }
        else if (state == NO_QUARTER) System.out.println("You haven't inserted a quarter");
        else if (state == SOLD) System.out.println("Sorry, you already turned the crank");
        else if (state == SOLD_OUT) System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    public void turnCrank() {
        if (state == SOLD) System.out.println("Turning twice doesn't give you another gumball");
        else if (state == NO_QUARTER) System.out.println("You turned but there is no quarter");
        else if (state == SOLD_OUT) System.out.println("You turned, but there are no gumballs");
        else if (state == HAS_QUARTER) {
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    public void dispense() {
        if (state == SOLD) {
            System.out.println("Retrieve you gumball");
            count--;
            if (count == 0) {
                System.out.println("Oops, out of gumballs");
                state = SOLD_OUT;
            }
            else state = NO_QUARTER;
        }
        else if (state == NO_QUARTER) System.out.println("You need to pay first");
        else if (state == SOLD_OUT) System.out.println("No gumball dispensed");
        else if (state == HAS_QUARTER) System.out.println("You need to turn the crank");
    }

    public void refill(int count) {
        this.count = count;
        if (count > 0) state = NO_QUARTER;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n\"Gumballs-2-Go\"\n")
                .append("Java-enabled standing Model #2021-1\n")
                .append("Inventory: ").append(count).append("\n");

        if (state == SOLD_OUT) builder.append("Machine is sold out\n");
        else if (state == NO_QUARTER) builder.append("Machine is waiting for your quarter\n");
        else if (state == HAS_QUARTER) builder.append("Machine is waiting to be cranked\n");
        else if (state == SOLD) builder.append("Machine is giving you your gumball\n");
        else builder.append("UNKNOWN_STATE\n");
        return builder.toString();
    }
}
