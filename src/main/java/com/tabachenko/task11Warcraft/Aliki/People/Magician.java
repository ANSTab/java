package com.tabachenko.task11Warcraft.Aliki.People;
import com.tabachenko.task11Warcraft.Aliki.Human;
import com.tabachenko.task11Warcraft.Hero;

public class Magician extends Human {
    private int attack = 10;
    private int hil = 5;

    @Override
    public String toString() {
        return "Magician{" +
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
