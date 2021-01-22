package com.tabachenko.task11Warcraft.Aliki.Elfu;

import com.tabachenko.task11Warcraft.Aliki.Alliance;
import com.tabachenko.task11Warcraft.Aliki.Elf;
import com.tabachenko.task11Warcraft.Hero;
import com.tabachenko.task11Warcraft.Orda.Horde;

public class Archer extends Elf {
    private int attack = 3;
    private int superAttack = 7;
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
        if (hero.helth!=0){
            hero.setHelth(hero.helth - attack);
        }

        return hero;
    }
    @Override
    public Hero betterAttack(Hero hero) {
        hero.setHelth(hero.helth - superAttack);
        return hero;
    }



}
