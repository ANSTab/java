package com.tabachenko.task11Warcraft.Orda.Orku;

import com.tabachenko.task11Warcraft.Hero;
import com.tabachenko.task11Warcraft.Orda.Ork;

public class Goblin extends Ork {
    private int attack = 20;

    @Override
    public String toString() {
        return "Goblin{" +
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
    public Hero fight(Hero hero ) {
        hero.setHelth(hero.helth - attack);
        return hero;
    }

    @Override
    public Hero betterAttack(Hero hero) {
        hero.setHelth(hero.helth - attack);
        return hero;
    }

}
