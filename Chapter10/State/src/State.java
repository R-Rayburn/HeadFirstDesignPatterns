public interface State {
    // NOTE: If we want to prevent certain states from performing
    //  any of these behaviors, we could initially make this an
    //  abstract class and throw a NotImplementedException initially.
    //  Otherwise, we could set default actions to reduce duplicate code.
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill();
}
