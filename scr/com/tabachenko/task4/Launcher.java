package com.tabachenko.task4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Launcher {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskMenegerImpl();

        taskManager.add(LocalDate.parse("1995-09-01"),new Task("AlexLearn","School"));
        taskManager.add(LocalDate.parse("2011-04-30"),new Task("AlexWork","work"));
        taskManager.add(LocalDate.parse("1988-10-17"),new Task("AlexBorn","dn"));
        taskManager.add(LocalDate.parse("2006-09-01"),new Task("AlexStudy","univercity"));
        taskManager.add(LocalDate.parse("2020-11-11"),new Task("AlexWorking","workingNow"));
        taskManager.add(LocalDate.parse("2020-11-11"),new Task("AlexWorkingBliy","workingNow"));
        taskManager.add(LocalDate.parse("2020-11-11"),new Task("AlexWorkingBlsdfsfiy","workingNow"));


        System.out.println("__________________________________");
        taskManager.printMap();
        taskManager.sortMap();
        //taskManager.remove(LocalDate.parse("1988-10-17"));
        taskManager.printMap();
        System.out.println("__________________________________");
        taskManager.getCategories();
        System.out.println("__________________________________");
        taskManager.getTasksByCategory("workingNow");



       /* Map<LocalDate, Task> map = new HashMap<>();
        map.put(LocalDate.parse("1988-10-17"), new Task("Alex", "dn"));
        map.put(LocalDate.parse("1995-09-01"), new Task("Alex", "school"));
        map.put(LocalDate.parse("2006-09-01"), new Task("Alex", "univercity"));
        map.put(LocalDate.parse("2011-04-30"), new Task("Alex", "work"));
        map.put(LocalDate.parse("2020-11-11"), new Task("Alex", "workingNow"));

       /* Set set = map.entrySet();
        for (Object o : set) {
            System.out.println(o);
        }
        System.out.println("__________________________________");
        Map<LocalDate, Task> map1 = new TreeMap<>(map);
        Set set1 = map1.entrySet();
        for (Object o : set1) {
            System.out.println(o);
        }
        System.out.println("__________________________________");
        Collection<Task> list = map.values();
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("__________________________________");
        Set<LocalDate> taskSet = map.keySet();
        for(Object o:taskSet){
            System.out.println(o);
        }

*/


    }
}

