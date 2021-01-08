package com.tabachenko.task9;

public class LauncherCat {

    public static void main(String[] args) throws IllegalAccessException {
        Cat cat = new Cat("Murchik",2,"black");

        ReflectionCat reflectionCat = new ReflectionCat();
        System.out.println(reflectionCat.changeCatRuntime(cat));
    }
}
