import Weapon.SwordBehavior;

public class Knight extends Character {
    public Knight() {
        weapon = new SwordBehavior();
    }

    @Override
    void fight() {
        System.out.println("Knight is fighting");
    }
}
