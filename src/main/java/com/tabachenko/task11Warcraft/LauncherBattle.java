package com.tabachenko.task11Warcraft;
import com.tabachenko.task11Warcraft.Aliki.Elfu.Archer;
import com.tabachenko.task11Warcraft.Aliki.Elfu.Warior;
import com.tabachenko.task11Warcraft.Aliki.People.Magician;
import com.tabachenko.task11Warcraft.Aliki.People.Paladin;
import com.tabachenko.task11Warcraft.Aliki.People.Сrossbowman;
import com.tabachenko.task11Warcraft.Orda.Orku.Goblin;
import com.tabachenko.task11Warcraft.Orda.Orku.Hanter;
import com.tabachenko.task11Warcraft.Aliki.Elfu.Mage;
import com.tabachenko.task11Warcraft.Orda.Orku.Shaman;
import com.tabachenko.task11Warcraft.Orda.Zonbi.AndedArcher;
import com.tabachenko.task11Warcraft.Orda.Zonbi.DemonLok;
import com.tabachenko.task11Warcraft.Orda.Zonbi.ZombiWar;
import java.util.ArrayList;
import java.util.List;

public class LauncherBattle {
    public static void main(String[] args) {
        Hero mageElf = new Mage();
        Hero archerElf = new Archer();
        Hero warElf = new Warior();
        Hero mageHuman = new Magician();
        Hero PalHuman = new Paladin();
        Hero crossHuman = new Сrossbowman();

        List<Hero> partyAlikow = new ArrayList();
        partyAlikow.add(mageElf);
        partyAlikow.add(archerElf);
        partyAlikow.add(warElf);
        partyAlikow.add(mageHuman);
        partyAlikow.add(PalHuman);
        partyAlikow.add(crossHuman);

        System.out.println(partyAlikow);


        Hero hanterOrk = new Hanter();
        Hero shamanOrk = new Shaman();
        Hero goblin = new Goblin();
        Hero arcerZombi = new AndedArcher();
        Hero warAnded= new ZombiWar();
        Hero lok = new DemonLok();

    }

}
