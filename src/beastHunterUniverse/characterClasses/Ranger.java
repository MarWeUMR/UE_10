package beastHunterUniverse.characterClasses;

import beastHunterUniverse.weaponTypes.Ranged;
import beastHunterUniverse.weaponTypes.TwoHanded;
import beastHunterUniverse.weaponTypes.Weapon;
import beastHunterUniverse.weapons.Dagger;

public class Ranger {

    private Weapon weapon;

    public <T extends Weapon & Ranged & TwoHanded> void equip(T t) {
        this.weapon = t;
    }
}
