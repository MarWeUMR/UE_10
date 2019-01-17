package beastHunterUniverse.characterClasses;

import beastHunterUniverse.weaponTypes.Melee;
import beastHunterUniverse.weaponTypes.OneHanded;
import beastHunterUniverse.weaponTypes.Weapon;

public class Rogue {

    private Weapon weaponRight;
    private Weapon weaponLeft;

    public <R extends Weapon & Melee & OneHanded,
            L extends Weapon & Melee & OneHanded> void equip(R r, L l) {
        this.weaponRight = r;
        this.weaponLeft = l;
    }
}
