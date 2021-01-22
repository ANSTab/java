package com.tabachenko.task11Warcraft.Orda.Zonbi;

import com.tabachenko.task11Warcraft.Hero;
import com.tabachenko.task11Warcraft.Orda.Anded;


public class ZombiWar extends Anded {
    private int attack = 15;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public Hero fight(Hero hero) {
        hero.setHelth(hero.helth - attack);
        return hero;
    }

    @Override
    public Hero betterAttack(Hero hero) {
        hero.setHelth(hero.helth - attack);
        return hero;
    }

}
