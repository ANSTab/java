package com.tabachenko.task4;

import java.util.*;

public class Launcher {
    public static void main(String[] args) {

        Map<com.tabachenko.task4.LocalDateTime, Task> map = new HashMap<>();
        map.put(new com.tabachenko.task4.LocalDateTime(17,10,1988), new Task("Alex", "dn"));
        map.put(new com.tabachenko.task4.LocalDateTime(1,9,1995), new Task("Alex", "school"));
        map.put(new com.tabachenko.task4.LocalDateTime(1,9,2006), new Task("Alex", "univercity"));
        map.put(new com.tabachenko.task4.LocalDateTime(31,4,2011), new Task("Alex", "work"));
        map.put(new com.tabachenko.task4.LocalDateTime(9,11,2020), new Task("Alex", "workingNow"));

        Set set = map.entrySet();
        for (Object o : set) {
            System.out.println(o);
        }
        System.out.println("__________________________________");
        Map<LocalDateTime, Task> map1 = new TreeMap<>(map);
        Set set1 = map1.entrySet();
        for (Object o : set1) {
            System.out.println(o);
        }
        Collection<Task> list = map.values();
        for (Object o : list) {
            System.out.println(o);
        }

    }
}

