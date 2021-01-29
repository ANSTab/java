package com.tabachenko.task3;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayOperationImplStream implements IArrayOperation{


    @Override
    public int test(int a, int b) {
        int c = a + b;
        return c;
    }

    @Override
    public boolean equals(int[] a, int[] b) {

        return Arrays.stream(a).equals(b);

    }

    @Override
    public void printArraysequals(int[] m, int[] p) {

    }

    @Override
    public int[] union(int[] a, int[] b) {
        return new int[0];
    }

    @Override
    public void printArraysUnion(int[] m, int[] p) {

    }

    @Override
    public int[] subtract(int[] a, int[] b) {
        return new int[0];
    }

    @Override
    public void printArraysSubtract(int[] m, int[] p) {

    }

    @Override
    public int[] intersect(int[] a, int[] b) {
        return new int[0];
    }

    @Override
    public void printArraysIntersect(int[] m, int[] p) {

    }

    @Override
    public int[] symmetricSubtract(int[] a, int[] b) {
        return new int[0];
    }

    @Override
    public void printSymmetricSubtract(int[] m, int[] p) {

    }

    @Override
    public int[] deleteNull(int[] m, int[] p) {
        return new int[0];
    }

    @Override
    public void printdeleteNull(int[] m, int[] p) {

    }
}
