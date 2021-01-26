package com.tabachenko.task11Warcraft.Aliki.People;
import com.tabachenko.task11Warcraft.Aliki.Human;
import com.tabachenko.task11Warcraft.Hero;


public class Сrossbowman extends Human {

    private int attack = 3;
    private int superAttack = 5;

    @Override
    public String toString() {
        return "Сrossbowman{" +
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
    public Hero fight (Hero hero) {
        hero.setHelth(hero.helth - attack);
        return hero;
    }

    @Override
    public Hero betterAttack(Hero hero) {
        hero.setHelth(hero.helth - superAttack);
        return hero;
    }

}
