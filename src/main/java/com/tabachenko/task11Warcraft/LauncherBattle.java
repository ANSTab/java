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
import org.apache.log4j.Logger;
import org.apache.log4j.xml.Log4jEntityResolver;

public class LauncherBattle {

    private static SuperMetods superMetods;

    public static void main(String[] args) {

        // АЛЬЯНС
        Hero mageElf = new Mage();
        Hero archerElf = new Archer();
        Hero warElf = new Warior();
        Hero mageHuman = new Magician();
        Hero palHuman = new Paladin();
        Hero crossHuman = new Сrossbowman();
//================================================
        // ОРДА
        Hero hanterOrk = new Hanter();
        Hero shamanOrk = new Shaman();
        Hero goblin = new Goblin();
        Hero arcerZombi = new AndedArcher();
        Hero warAnded = new ZombiWar();
        Hero lok = new DemonLok();

        superMetods = new SuperMetods();

        //  System.out.println(superMetods.battleHordeWithAllianceOneOnOne(goblin, mageElf));
        superMetods.battleHordeOnAllianceParty(superMetods.createPartyHorde(), superMetods.createPartyAlliance());

    }
}