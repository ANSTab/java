package com.tabachenko.task4;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

public interface TaskManager {
   //додати задачку на якийся час
    void add(LocalDateTime date, Task task);
    //видалити задачку по часу
    void remove11111(LocalDateTime date) throws NoSuchElementException;


    // отримати всі категорії по задачкам
   /* Set<String> getCategories();
    //For next 3 methods tasks should be sorted by date
    Map<String, List<Task>> getTasksByCategories(String... categories);
    //отримати список всих задач по категорії
    List<Task> getTasksByCategory(String category);
    //тут понятно отримати всі таски на сьогодні
    List<Task> getTasksForToday();
    */

}
