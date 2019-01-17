package beastHunterUniverse.characterClasses;

import beastHunterUniverse.weaponTypes.Weapon;

public class Warrior {

    private Weapon weapon;

    public <W extends Weapon> void equip(W w) {
        this.weapon = w;
    }
}
