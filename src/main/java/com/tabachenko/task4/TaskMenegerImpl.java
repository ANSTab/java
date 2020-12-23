package com.tabachenko.task4;

import java.time.LocalDate;
import java.util.*;

public class TaskMenegerImpl implements TaskManager {

    private Map<LocalDate, Task> map = new HashMap<>();


    @Override
    public void add(LocalDate date, Task task) {
        map.put(date, task);

    }

    @Override
    public void remove(LocalDate date) throws NoSuchElementException {
        for (Map.Entry<LocalDate, Task> entry : map.entrySet()) {
            if (entry.getKey().equals(date)) {
                map.remove(date);
                System.out.println("знайдено дату");
                System.out.println(map);
                break;
            } else {
                System.out.println("Дати не знайдено");
            }
        }
    }

    @Override
    public Set<String> getCategories(Map<LocalDate, Task> map) {
        Set<String> stringSet = new HashSet<>();
        for (Map.Entry<LocalDate, Task> entry : map.entrySet()) {
            //  System.out.println("ID =  " + entry.getKey() + " День недели = " + entry.getValue());
            String task = entry.getValue().getCategory();
            stringSet.add(task);
        }
        return stringSet;
    }

    @Override
    public Map<String, List<Task>> getTasksByCategories(String[] categories) {
        Map<String, List<Task>> stringListMap = new HashMap<>();
        for (int i = 0; i < categories.length; i++) {
            List<Task> taskList = new ArrayList<>();
            for (Map.Entry<LocalDate, Task> entry : map.entrySet()) {
                if (categories[i].equals(entry.getValue().getCategory())) {
                    taskList.add(entry.getValue());
                    stringListMap.put(categories[i], taskList);
                    //System.out.println(taskList);
                }
            }
        }
        return stringListMap;
    }

    @Override
    public List<Task> getTasksByCategory(String category) {
        List<Task> taskList = new ArrayList<>();
        Collection<Task> taskList1 = map.values();
        for (Task i : taskList1) {
            if (i.getCategory().equals(category)) {
                taskList.add(i);
            }
        }
        return taskList;
    }

    @Override
    public List<Task> getTasksForToday(LocalDate date) {
        List<Task> taskList = new ArrayList<>();
        for (Map.Entry<LocalDate, Task> entry : map.entrySet()) {
            if (entry.getKey().equals(date)) {
                taskList.add(entry.getValue());
            }
        }
        return taskList;
    }

    @Override
    public void printMap() {
        TaskManager taskManager = new TaskMenegerImpl();
        System.out.println(map);
        System.out.println("____________________________");
        System.out.println(taskManager.getCategories(map));
        System.out.println("____________________________");
        Map<LocalDate, Task> mapTree = new TreeMap<>(map);
        System.out.println(mapTree);


    }

}
