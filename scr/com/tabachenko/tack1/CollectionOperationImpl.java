package com.tabachenko.tack1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionOperationImpl implements CollectionOperation {
    @Override
    public List<Task> distincList(List<Task> collection) {
        boolean pravda = false;
        for (int i = 0; i < collection.size() - 1; i++) {
            for (int j = i + 1; j < collection.size(); j++) {
                if (collection.get(i).hashCode() == (collection.get(j).hashCode())) {
                    pravda = true;
                    collection.remove(j);
                    j--;
                }
            }
        }
        return collection;
    }

    @Override
    public Set<Task> distincCollection(List<Task> collection) {
        Set<Task> collectionSet = new HashSet<>(collection);
        return collectionSet;
    }

    @Override
    public void myMetColl(List<Task> collection) {
        CollectionOperation myColl = new CollectionOperationImpl();
        System.out.println(myColl.distincCollection(collection));
        System.out.println(myColl.distincList(collection));
    }
}
