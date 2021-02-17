import Weapon.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        weapon = new AxeBehavior();
    }

    @Override
    void fight() {
        System.out.println("Troll is fighting");
    }
}
