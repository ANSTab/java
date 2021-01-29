package com.tabachenko.task11Warcraft.Orda.Orku;

import com.tabachenko.task11Warcraft.Hero;
import com.tabachenko.task11Warcraft.Orda.Ork;

public class Hanter extends Ork {

    private int attack = 2;
    private int superAttack = 3;

    @Override
    public String toString() {
        return "Hanter{" +
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
