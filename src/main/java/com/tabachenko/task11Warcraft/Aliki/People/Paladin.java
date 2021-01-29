package com.tabachenko.task11Warcraft.Aliki.People;

import com.tabachenko.task11Warcraft.Aliki.Human;
import com.tabachenko.task11Warcraft.Hero;

public class Paladin extends Human {

    private int attack = 18;

    @Override
    public String toString() {
        return "Paladin{" +
                "attack=" + attack +
                '}';
    }

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
