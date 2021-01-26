package com.tabachenko.task11Warcraft.Orda.Zonbi;

import com.tabachenko.task11Warcraft.Aliki.Alliance;
import com.tabachenko.task11Warcraft.Hero;
import com.tabachenko.task11Warcraft.Orda.Anded;
import com.tabachenko.task11Warcraft.Orda.Horde;

public class DemonLok extends Anded {

    private int attack = 10;
    private int hil = 5;

    @Override
    public String toString() {
        return "DemonLok{" +
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
        hero.setHelth(hero.helth +hil);
        return hero;
    }
}
