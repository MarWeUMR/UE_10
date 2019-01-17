package beastHunterUniverse;

import beastHunterUniverse.weaponTypes.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Lootcrate {

    private List<Weapon> weaponList;

    /**
     * Constructor for a Lootcrate instance.
     *
     * @param weaponList List of Weapons contained in the crate.
     */
    public Lootcrate(List<Weapon> weaponList) {
        this.weaponList = weaponList;
    }

    /**
     * Method to retrieve all weapons of a given type.
     *
     * @param weapon specific weapon object to check against.
     * @param <T>    allowed types of weapons to check for.
     * @return list with all weapons of the specified type.
     */
    public <T extends Weapon> List<T> filter(T weapon) {

        List<Weapon> lootList = new ArrayList<>();

        for (Weapon w : weaponList) {
            if (weapon.getClass().isInstance(w)) {

                lootList.add(w);
            }
        }

        return (List<T>) lootList;

    }


}
