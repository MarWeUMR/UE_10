package beastHunterUniverse.characterClasses;

import beastHunterUniverse.weaponTypes.Weapon;

public class Rogue {

    private Weapon weaponRight;
    private Weapon weaponLeft;

    public <W extends Weapon> void equip(W wR, W wL) {
        this.weaponRight = wR;
        this.weaponLeft = wL;
    }
}
