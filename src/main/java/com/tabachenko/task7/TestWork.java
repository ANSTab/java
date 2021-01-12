/*
package com.tabachenko.task7;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestWork {
    final static Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) throws IOException {

        KV test = new KV("1", "qwer");
        KV test2 = new KV("2", "qwesdfsdfr");

        List<KV> kvList = new ArrayList<>();
        kvList.add(test);
        kvList.add(test2);
        String s = GSON.toJson(kvList);

        File file = new File("D:\\java\\qw.json");
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fis = new FileInputStream("D:\\java\\qw.json")) {
            int b = 0;
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        KV [] kvs = GSON.fromJson(s,KV [].class);
        for (KV kv: kvs){
            System.out.println(kv.getKey());
            System.out.println(kv.getValue());
        }

    }

    public static class KV {
        private String key;
        private String value;

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public KV(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
*/
