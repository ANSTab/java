package com.tabachenko.task12Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperetionStreamWork {
    public static void main(String[] args) {
        int[] mass1 = {5, 8, 7};
        int[] mass2 = {8, 7, 5};
        //  int[] mass2 = {8, 7, 5};

        // Arrays.stream(mass1).mapToObj(i -> mass1 == mass2).forEach(System.out::println);
        // IntStream.range(0, mass1.length).mapToObj(i -> mass1[i] == mass2[i]).forEach(System.out::println);


            Arrays.stream(mass1).filter(x -> x == mass2[0]).filter(x -> x == mass2[1]).filter(x -> x == mass2[2]);

        }


    }

