import Duck.*;
import Turkey.*;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The turkey says...");
        testTurkey(turkey);

        System.out.println("\nThe duck says...");
        testDuck(duck);

        System.out.println("\nThe Duck.TurkeyAdapter says...");
        testDuck(turkeyAdapter);

        System.out.println("\nThe Turkey.DuckAdapter says...");
        testTurkey(duckAdapter);
    }

    private static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
