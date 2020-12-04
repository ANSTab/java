package com.tabachenko.task7;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InvalidObjectException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

    final static Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {

        InfoTask ifT = new InfoTask("BMCOPS", "CIS - Windows Server 2012 R2 MS", 15680394, "IDMService", "IDMServiceUser", "This Policy is created based on the recommended settings defined by Microsoft Windows Server 2012 R2 Security Configuration Benchmark Version 2.2.0, published on April 28th, 2016\nReference#:\nhttp://cisecurity.org", "1.0", 1);
        String json = GSON.toJson(ifT);
        IFfromJson iFfromJson = new IFfromJson();

       // System.out.println(iFfromJson.serializetion(json));
        KV kv = new KV("asd","dasd");


        ArrayList<KV> arrayList = new ArrayList<>();
        arrayList.add(kv);
        Task7 task7 = new Task7("sdf","sdf",151,"dsf","sdf","sdfdf","sdf",1,arrayList,"df");


        //System.out.println((task7).toString());

        String in= null;
        try {
            in = iFfromJson.deserializatior();
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        //System.out.println(in);
    }
}
