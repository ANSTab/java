package com.tabachenko.task11Warcraft;

import com.tabachenko.task11Warcraft.Aliki.Elfu.Archer;
import com.tabachenko.task11Warcraft.Aliki.Elfu.Mage;
import com.tabachenko.task11Warcraft.Aliki.Elfu.Warior;
import com.tabachenko.task11Warcraft.Aliki.People.Magician;
import com.tabachenko.task11Warcraft.Aliki.People.Paladin;
import com.tabachenko.task11Warcraft.Aliki.People.Сrossbowman;
import com.tabachenko.task11Warcraft.Orda.Orku.Goblin;
import com.tabachenko.task11Warcraft.Orda.Orku.Hanter;
import com.tabachenko.task11Warcraft.Orda.Orku.Shaman;
import com.tabachenko.task11Warcraft.Orda.Zonbi.AndedArcher;
import com.tabachenko.task11Warcraft.Orda.Zonbi.DemonLok;
import com.tabachenko.task11Warcraft.Orda.Zonbi.ZombiWar;

import java.util.ArrayList;
import java.util.List;

public class SuperMetods {
    Hero mageElf = new Mage();
    Hero archerElf = new Archer();
    Hero warElf = new Warior();
    Hero mageHuman = new Magician();
    Hero palHuman = new Paladin();
    Hero crossHuman = new Сrossbowman();
//________________________________________
    Hero hanterOrk = new Hanter();
    Hero shamanOrk = new Shaman();
    Hero goblin = new Goblin();
    Hero arcerZombi = new AndedArcher();
    Hero warAnded = new ZombiWar();
    Hero lok = new DemonLok();

    public Hero battleHordeWithAllianceOneOnOne(Hero horde, Hero alik) {

        Hero winner = null;
        for (int i = 0; i <= 20; i++) {
            if (horde.helth != 0 || alik.helth != 0) {
                horde.fight(alik);
                System.out.println("ХП алика: " + alik.helth);
                if (alik.helth <= 0) {
                    System.out.println("Winner Horde !!!!!");
                    break;
                }
                alik.fight(horde);
                System.out.println("ХП урки: " + horde.helth);
                if (horde.helth <= 0) {
                    System.out.println("Winner  Alliance !!!!");
                    break;
                }
                if (String.valueOf(horde.getClass()).contains("Shaman")||String.valueOf(horde.getClass()).contains("DemonLok")) {
                    horde.betterAttack(horde);
                    System.out.println("ХП урки: " + horde.helth);
                } else {
                    horde.betterAttack(alik);
                    System.out.println("ХП алика: " + alik.helth);
                    if (alik.helth <= 0) {
                        System.out.println("Winner Horde !!!!!");
                        break;
                    }
                }
                if (String.valueOf(alik.getClass()).contains("Mage")||String.valueOf(alik.getClass()).contains("Magician")) {
                    alik.betterAttack(alik);
                    System.out.println("ХП алика: " + alik.helth);
                } else {
                    alik.betterAttack(horde);
                    System.out.println("ХП урки: " + horde.helth);
                    if (horde.helth <= 0) {
                        System.out.println("Winner Alliance !!!!!");
                        break;
                    }
                }
            }if (horde.helth <= 0){
            winner = alik;
        }else winner = horde;
        }
        return winner;
    }
    public List <Hero> createPartyHorde () {
        List <Hero> hordeParty = new ArrayList<>();
        hordeParty.add(warAnded);
        hordeParty.add(warAnded);
        hordeParty.add(goblin);
        hordeParty.add(goblin);
        hordeParty.add(arcerZombi);
        hordeParty.add(hanterOrk);
        hordeParty.add(hanterOrk);
        hordeParty.add(lok);
     return  hordeParty  ;
    }
    public List <Hero> createPartyAlliance (){
        List <Hero> allianceParty = new ArrayList<>();
        allianceParty.add(palHuman);
        allianceParty.add(palHuman);
        allianceParty.add(warElf);
        allianceParty.add(warElf);
        allianceParty.add(crossHuman);
        allianceParty.add(crossHuman);
        allianceParty.add(archerElf);
        allianceParty.add(mageElf);
        return allianceParty;
    }



public  List <Hero> battleHordeOnAllianceParty (List<Hero> hordeParty,List<Hero> allianceParty ){




        return hordeParty;
}

}
