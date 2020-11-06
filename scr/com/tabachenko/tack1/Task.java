package com.tabachenko.tack1;

import java.util.Objects;

public class Task {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Task(String n) {
        this.name = n;
    }
    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
