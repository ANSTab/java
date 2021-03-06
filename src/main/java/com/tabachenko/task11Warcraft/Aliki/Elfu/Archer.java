package com.tabachenko.task11Warcraft.Aliki.Elfu;

import com.tabachenko.task11Warcraft.Aliki.Elf;
import com.tabachenko.task11Warcraft.Hero;

public class Archer extends Elf {
    private int attack = 3;
    private int superAttack = 7;

    @Override
    public String toString() {
        return "Archer{" +
                "attack=" + attack +
                ", superAttack=" + superAttack +
                '}';
    }

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
