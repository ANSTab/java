package com.tabachenko.task11Warcraft.Orda.Zonbi;

import com.tabachenko.task11Warcraft.Aliki.Alliance;
import com.tabachenko.task11Warcraft.Hero;
import com.tabachenko.task11Warcraft.Orda.Anded;
import com.tabachenko.task11Warcraft.Orda.Horde;

public class AndedArcher extends Anded {
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getSuperAttack() {
        return superAttack;
    }
    public void setSuperAttack(int superAttack) {
        this.superAttack = superAttack;
    }
    private int attack = 2;
    private int superAttack = 4;

    @Override
    public Hero fight(Hero hero) {
        hero.setHelth(hero.helth - attack);
        return hero;
    }

    @Override
    public Hero betterAttack(Hero hero) {
        hero.setHelth(hero.helth - superAttack);
        return hero;
    }
}

