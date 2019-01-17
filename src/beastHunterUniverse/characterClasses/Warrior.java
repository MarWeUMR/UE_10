package beastHunterUniverse.characterClasses;

import beastHunterUniverse.weaponTypes.Weapon;

public class Warrior {

    private Weapon weapon;

    public <T extends Weapon> void equip(T t) {
        this.weapon = t;
    }
}
