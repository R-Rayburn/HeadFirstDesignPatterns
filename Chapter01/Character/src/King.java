import Weapon.BowAndArrowBehavior;

public class King extends Character {
    public King() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    void fight() {
        System.out.println("King is fighting");
    }
}
