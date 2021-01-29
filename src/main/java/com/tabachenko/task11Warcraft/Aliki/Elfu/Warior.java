package com.tabachenko.task11Warcraft.Aliki.Elfu;

import com.tabachenko.task11Warcraft.Aliki.Elf;
import com.tabachenko.task11Warcraft.Hero;

public class Warior extends Elf {
    private int attack = 15;

    @Override
    public String toString() {
        return "Warior{" +
                "attack=" + attack +
                '}';
    }

    @Override
    public int getHelth() {
        return helth;
    }

    @Override
    public void setHelth(int helth) {
        this.helth = helth;
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
