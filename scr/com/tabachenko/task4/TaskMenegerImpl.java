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
       Set<LocalDate> localDates = map.keySet();

        System.out.println(localDates);
        Iterator<LocalDate> dateIterator = localDates.iterator();
        while (dateIterator.hasNext()){
            LocalDate element = localDates.iterator().next();
            System.out.println(element);
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
