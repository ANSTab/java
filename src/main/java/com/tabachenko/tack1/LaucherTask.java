package com.tabachenko.tack1;

import java.util.ArrayList;
import java.util.List;

public class LaucherTask {
    public static void main(String[] args) {
        List<Task> collect = new ArrayList<Task>();
        collect.add(new Task("Alex"));
        collect.add(new Task("Alex"));
        collect.add(new Task("КурікШлапа"));
        collect.add(new Task("КурікШлапа"));
        collect.add(new Task("Alex"));
        collect.add(new Task("Alex"));
        collect.add(new Task("Vova"));
        collect.add(new Task("Vova"));
        collect.add(new Task("Bob"));

        CollectionOperation operation = new CollectionOperationImpl();
        operation.myMetColl(collect);
    }
}
