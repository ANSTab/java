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
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class SuperMetods {


    private static final Logger logger = Logger.getLogger(SuperMetods.class);


    Hero mageElf = new Mage();
    Hero archerElf = new Archer();
    Hero archerElf1 = new Archer();
    Hero warElf = new Warior();
    Hero warElf1 = new Warior();
    Hero mageHuman = new Magician();
    Hero palHuman = new Paladin();
    Hero palHuman1 = new Paladin();
    Hero crossHuman = new Сrossbowman();
    //________________________________________
    Hero hanterOrk = new Hanter();
    Hero hanterOrk111 = new Hanter();
    Hero shamanOrk = new Shaman();
    Hero goblin = new Goblin();
    Hero goblin12 = new Goblin();
    Hero arcerZombi = new AndedArcher();
    Hero warAnded = new ZombiWar();
    Hero warAnded1 = new ZombiWar();
    Hero lok = new DemonLok();
    public Hero battleHordeWithAllianceOneOnOne(Hero horde, Hero alik) {
        System.out.println("В битві приймаються участь: " + horde);
        System.out.println("В битві приймаються участь: " + alik);
        Hero winner = null;
        for (int i = 0; i <= 200; i++) {
            if (horde.helth != 0 || alik.helth != 0) {
                horde.fight(alik);
                System.out.println("ХП алика: " + alik.helth);
                if (alik.helth <= 0) {
                    System.out.println("Winner Horde !!!!!");
                    winner = horde;
                    System.out.println("Переможець бою: " + winner);
                    break;
                }
                alik.fight(horde);
                System.out.println("ХП урки: " + horde.helth);
                if (horde.helth <= 0) {
                    System.out.println("Winner  Alliance !!!!");
                    winner = alik;
                    System.out.println("Переможець бою: " + winner);
                    break;
                }
                if (String.valueOf(horde.getClass()).contains("Shaman") || String.valueOf(horde.getClass()).contains("DemonLok")) {
                    horde.betterAttack(horde);
                    System.out.println("ХП урки: " + horde.helth);
                } else {
                    horde.betterAttack(alik);
                    System.out.println("ХП алика: " + alik.helth);
                    if (alik.helth <= 0) {
                        System.out.println("Winner Horde !!!!!");
                        winner = horde;
                        System.out.println("Переможець бою: " + winner);
                        break;
                    }
                }
                if (String.valueOf(alik.getClass()).contains("Mage") || String.valueOf(alik.getClass()).contains("Magician")) {
                    alik.betterAttack(alik);
                    System.out.println("ХП алика: " + alik.helth);
                } else {
                    alik.betterAttack(horde);
                    System.out.println("ХП урки: " + horde.helth);
                    if (horde.helth <= 0) {
                        System.out.println("Winner Alliance !!!!!");
                        winner = alik;
                        System.out.println("Переможець бою: " + winner);
                        break;
                    }
                }
            }
        }
        return winner;
    }

    public List<Hero> createPartyHorde() {
        List<Hero> hordeParty = new ArrayList<>();
        hordeParty.add(warAnded1);
        hordeParty.add(warAnded);
        hordeParty.add(goblin12);
        hordeParty.add(goblin);
        hordeParty.add(arcerZombi);
        hordeParty.add(hanterOrk111);
        hordeParty.add(hanterOrk);
        hordeParty.add(lok);
        return hordeParty;
    }

    public List<Hero> createPartyAlliance() {
        List<Hero> allianceParty = new ArrayList<>();
        allianceParty.add(palHuman);
        allianceParty.add(palHuman1);
        allianceParty.add(warElf);
        allianceParty.add(warElf1);
        allianceParty.add(crossHuman);
        allianceParty.add(archerElf1);
        allianceParty.add(archerElf);
        allianceParty.add(mageElf);
        return allianceParty;
    }

    public void battleHordeOnAllianceParty(List<Hero> hordeParty, List<Hero> allianceParty) {
        int i = 1;
        while (hordeParty.size() != 0 || allianceParty.size() != 0) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!   БІЙ № " + i + "   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            SuperMetods superMetods = new SuperMetods();
            int randomOrda = 0 + (int) (Math.random() * hordeParty.size());
            int randomAlik = 0 + (int) (Math.random() * allianceParty.size());
            String newWinner = String.valueOf(superMetods.battleHordeWithAllianceOneOnOne(hordeParty.get(randomOrda), allianceParty.get(randomAlik)).getClass());
           // logger.info("пройшов бій");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            if (newWinner.contains("Orda")) {
                allianceParty.remove(randomAlik);
                i++;
                System.out.println("========== КОМАНДА ОРДИ =========");
                for (Hero h : hordeParty) {
                    if (hordeParty.get(randomOrda) == h) {
                        h.setHelth(hordeParty.get(randomOrda).helth);
                    }
                    System.out.println(h + " " + h.helth);
                }
                System.out.println("========== КОМАНДА АЛЬЯНСУ =========");
                for (Hero a : allianceParty) {
                    System.out.println(a + " " + a.helth);
                }
            }
            if (newWinner.contains("Aliki")) {
                hordeParty.remove(randomOrda);
                i++;
                System.out.println("========== КОМАНДА АЛЬЯНСУ =========");
                for (Hero a : allianceParty) {
                    if (allianceParty.get(randomAlik) == a) {
                        a.setHelth(allianceParty.get(randomAlik).helth);
                    }
                    System.out.println(a + " " + a.helth);
                }
                System.out.println("========== КОМАНДА ОРДИ =========");
                for (Hero h : hordeParty) {
                    System.out.println(h + " " + h.helth);
                }
            }
            if (hordeParty.size() == 0 || allianceParty.size() == 0) {
                System.out.println("ВІЙНА ЗАКІНЧИЛАСЬ");
                if (hordeParty.size() == 0) {
                    System.out.println("ПЕРЕМОЖЕЦЬ ВІЙНИ АЛЬЯНС");
                } else if (allianceParty.size() == 0) {
                    System.out.println("ПЕРЕМОЖЕЦЬ ВІЙНИ ОРДА");
                }
                break;
            }
        }
    }
}
