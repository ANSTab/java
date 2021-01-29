package com.tabachenko.task11Warcraft.Orda.Orku;

import com.tabachenko.task11Warcraft.Hero;
import com.tabachenko.task11Warcraft.Orda.Ork;

public class Shaman extends Ork {

    private int attack = 10;
    private int hil = 5;

    @Override
    public String toString() {
        return "Shaman{" +
                "attack=" + attack +
                ", hil=" + hil +
                '}';
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHil() {
        return hil;
    }

    public void setHil(int hil) {
        this.hil = hil;
    }

    @Override
    public Hero fight(Hero hero) {
        hero.setHelth(hero.helth - attack);
        return hero;
    }

    @Override
    public Hero betterAttack(Hero hero) {
        hero.setHelth(hero.helth + hil);
        return hero;
    }
}
