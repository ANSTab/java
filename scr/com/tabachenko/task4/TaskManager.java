package com.tabachenko.task4;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public interface TaskManager {
   //додати задачку на якийся час
    public  void add(LocalDate date, Task task);
    //видалити задачку по часу
    void remove(LocalDate date) throws NoSuchElementException;

    // отримати всі категорії по задачкам
    void getCategories();

    //For next 3 methods tasks should be sorted by date
    /*Map<String, List<Task>> getTasksByCategories(String... categories);
    //отримати список всих задач по категорії*/
     void getTasksByCategory(String category);

    //тут понятно отримати всі таски на сьогодні
    List<Task> getTasksForToday(Map<LocalDate,Task> categorForToday);
    void printMap();
    void sortMap();
}
