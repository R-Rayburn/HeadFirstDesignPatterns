public interface State {
    // NOTE: If we want to prevent certain states from performing
    //  any of these behaviors, we could initially make this an
    //  abstract class and throw a NotImplementedException initially
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
