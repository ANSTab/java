package com.tabachenko.task7;

import com.github.lbovolini.mapper.ObjectMapper;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    final static Gson GSON = new GsonBuilder().setPrettyPrinting().create();


    public static void main(String[] args) throws InvalidObjectException {

        InfoTask ifT = new InfoTask("BMCOPS", "CIS - Windows Server 2012 R2 MS", 15680394, "IDMService", "IDMServiceUser", "This Policy is created based on the recommended settings defined by Microsoft Windows Server 2012 R2 Security Configuration Benchmark Version 2.2.0, published on April 28th, 2016\nReference#:\nhttp://cisecurity.org", "1.0", 1);
        // String json = GSON.toJson(ifT);
        IFfromJson iFfromJson = new IFfromJson();

       /* KV kv = new KV("provider", "Server");
        KV kv1 = new KV("selectionHint", "Windows_2012_R2_MS");
        KV kv2 = new KV("vendor", "CIS");
        KV kv3 = new KV("benchmark", "CIS Microsoft Windows Server 2012 R2 Benchmark");


        ArrayList<KV> arrayList = new ArrayList<>();
        arrayList.add(kv);
        arrayList.add(kv1);
        arrayList.add(kv2);
        arrayList.add(kv3);

        TaskWork task = new TaskWork("BMCOPS", "CIS - Windows Server 2012 R2 MS", 15680394, "IDMService", "IDMServiceUser", "This Policy is created based on the recommended settings defined by Microsoft Windows Server 2012 R2 Security Configuration Benchmark Version 2.2.0, published on April 28th, 2016\nReference#:\nhttp://cisecurity.org", "1.0", 1, arrayList, "BMCOPS_CIS_-_Windows_Server_2012_R2_MS");
*/
        List<TaskWork> workingTask = new ArrayList();
        //workingTask.add(task);
        // String json = GSON.toJson(workingTask);
        // System.out.println(iFfromJson.serializetion(json));
        String s = String.valueOf(iFfromJson.deserializatior());
        //  TaskWork  taskWork = GSON.fromJson(s,TaskWork.class);


        TaskWork [] taskWorks =GSON.fromJson(s, TaskWork [].class);
       for (TaskWork t: taskWorks){

           System.out.println(t.getLastUpdate());
       }




       /* String in= null;
        try {
            in = iFfromJson.deserializatior();
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        System.out.println(in);*/
    }
}
