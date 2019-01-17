package beastHunterUniverse;

import beastHunterUniverse.weaponTypes.Weapon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lootcrate {

    private List<Weapon> weaponList;

    public Lootcrate(List<Weapon> weaponList) {
        this.weaponList = weaponList;


    }

    public <T extends Weapon> List<T> filter(T weapon) {

        List<Weapon> lootList = new ArrayList<>();

        for (Weapon w : weaponList) {
            if (weapon.getClass().isInstance(w)) {

                lootList.add(w);
            }
        }

        return (List<T>)lootList;

    }


}
