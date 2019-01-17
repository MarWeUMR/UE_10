package beastHunterUniverse.characterClasses;

import beastHunterUniverse.weaponTypes.Weapon;

public class Ranger {

    private Weapon weapon;

    public <W extends Weapon> void equip(W w) {
        this.weapon = w;
    }
}
