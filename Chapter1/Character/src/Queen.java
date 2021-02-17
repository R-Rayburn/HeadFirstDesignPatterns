import Weapon.KnifeBehavior;

public class Queen extends Character {
    public Queen() {
        weapon = new KnifeBehavior();
    }

    @Override
    void fight() {
        System.out.println("Queen is fighting");
    }
}
