package com.tabachenko.task4;

import java.time.LocalDate;

public class Launcher {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskMenegerImpl();

        taskManager.add(LocalDate.parse("1995-09-01"), new Task("AlexLearn", "School"));
        taskManager.add(LocalDate.parse("2011-04-30"), new Task("AlexWork", "work"));
        taskManager.add(LocalDate.parse("1988-10-17"), new Task("AlexBorn", "dn"));
        taskManager.add(LocalDate.parse("2006-09-01"), new Task("AlexStudy", "univercity"));
        taskManager.add(LocalDate.parse("2020-12-11"), new Task("AlexWorking", "workingNow"));
        taskManager.add(LocalDate.parse("2016-11-12"), new Task("AlexWorkingBliy", "workingNow"));
        taskManager.add(LocalDate.parse("2017-12-11"), new Task("AlexWorkingBlsdfsfiy", "workingNow"));

        String [] categoris = {"School","work","univercity","HYINIY","workingNow"};
        //taskManager.printMap();
        //taskManager.remove(LocalDate.parse("1987-10-17"));
       // System.out.println("========================");
       // System.out.println(taskManager.getTasksByCategory("workingNow"));
        //System.out.println(taskManager.getTasksForToday(LocalDate.parse("2020-12-11")));
        System.out.println(taskManager.getTasksByCategories(categoris));


    }
}

