package com.tabachenko.task11Warcraft;

public abstract class Hero {

    public int helth = 100;
    public abstract Hero fight(Hero hero);
    public abstract Hero betterAttack(Hero hero);


    public int getHelth() {
        return helth;
    }

    public void setHelth(int helth) {
        this.helth = helth;
    }




}
