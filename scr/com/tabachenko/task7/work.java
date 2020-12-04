package com.tabachenko.task7;

import java.sql.Array;
import java.util.ArrayList;

public class work {
    public static void main(String[] args) {
        KV kv = new KV("asd","asda");
        KV kv1 = new KV("asd","asda");
        ArrayList<KV> arrayList = new ArrayList<>();
        arrayList.add(kv);
        arrayList.add(kv1);
        System.out.println(arrayList);



    }



}
