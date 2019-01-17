package beastHunterUniverse;

import beastHunterUniverse.weaponTypes.Weapon;
import beastHunterUniverse.weapons.Bow;
import beastHunterUniverse.weapons.CrossBow;
import beastHunterUniverse.weapons.Dagger;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class LootcrateTest {



    @Test
    public void filterTest() {
    List<Weapon> weaponList = new ArrayList<>();
        weaponList.add(new Dagger());
        weaponList.add(new Bow());
        weaponList.add(new CrossBow());
        weaponList.add(new Dagger());
        weaponList.add(new Dagger());

        Lootcrate lc = new Lootcrate(weaponList);

        List<Weapon> l = lc.filter(new Dagger());

        Assert.assertEquals(l.size(), 3);





    }
}