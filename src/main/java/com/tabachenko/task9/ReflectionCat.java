package com.tabachenko.task9;
import java.lang.reflect.Field;

public class ReflectionCat {
    public Cat changeCatRuntime(Cat cat) {
        Class clazz = cat.getClass();
        Field [] fields = clazz.getDeclaredFields();
        for (Field field: fields){
            field.setAccessible(true);
                cat.setName("Vasiy");
                cat.setAge(5);
                cat.setColor("white");

            field.setAccessible(false);
        }
        return cat;
    }
}
