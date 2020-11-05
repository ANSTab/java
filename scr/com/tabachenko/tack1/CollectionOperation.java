package com.tabachenko.tack1;

import java.util.List;
import java.util.Set;

public interface CollectionOperation {
    List<Task> distincList (List<Task> collection);
    Set<Task> distincCollection(List<Task> collection);
    void myMetColl(List<Task> collection);
}
