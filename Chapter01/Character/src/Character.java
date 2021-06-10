import Weapon.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;

    abstract void fight();

    public void setWeapon(WeaponBehavior w) {
        weapon = w;
    }

    public void useWeapon() {
        weapon.useWeapon();
    }
}
