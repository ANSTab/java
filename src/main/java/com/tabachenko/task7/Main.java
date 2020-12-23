package com.tabachenko.task7;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.InvalidObjectException;
public class Main {

    final static Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) throws InvalidObjectException {

        IFfromJson iFfromJson = new IFfromJson();
        String s = String.valueOf(iFfromJson.deserializatior());
        //  TaskWork  taskWork = GSON.fromJson(s,TaskWork.class);
        TaskWork[] taskWorks = GSON.fromJson(s, TaskWork[].class);
        for (TaskWork t : taskWorks) {
            System.out.println(t.getName());
            System.out.println(t.getLastUpdate());
        }
    }
}
