package com.tabachenko.task4;

import java.time.LocalDate;
import java.util.*;
import java.util.NoSuchElementException;

public class TaskMenegerImpl implements TaskManager {
    private Map<LocalDate, Task> map = new HashMap<>();


    @Override
    public void add(LocalDate date, Task task) {
        map.put(date, task);
    }

    @Override
    public void remove(LocalDate date) throws NoSuchElementException {
        map.remove(date);
    }

    @Override
    public void getCategories() {
        for (Map.Entry<LocalDate, Task> entry : map.entrySet()) {
            //  System.out.println("ID =  " + entry.getKey() + " День недели = " + entry.getValue());
            String task = entry.getValue().getCategory();
            System.out.println(task);
        }
    }

    @Override
    public void getTasksByCategory(String category) {
        for (Map.Entry<LocalDate, Task> entry : map.entrySet()) {
            String task = entry.getValue().getCategory();
            if (task.equals(category)) {
                String s = entry.getValue().getName();
                System.out.println(s);
            }
        }
    }

    @Override
    public List<Task> getTasksForToday(Map<LocalDate, Task> categorForToday) {

        return null;
    }

    @Override
    public void printMap() {
        System.out.println(map);
    }

    @Override
    public void sortMap() {
        Map<LocalDate, Task> mapTree = new TreeMap<>(map);
        System.out.println(mapTree);
    }


}
