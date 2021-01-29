package com.tabachenko.task12Stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LauncherStream {
    public static void main(String[] args) {
        int[] mass1 = {5, 8, 7};
        int[] mass2 = {5, 8, 7};

        Arrays.stream(mass1).mapToObj(i -> mass1 == mass2).collect(Collectors.toList()).forEach(System.out::println);



        IntStream.range(0, mass1.length).mapToObj(i -> mass1[i] == mass2[i]).forEach(System.out::println);

    }
}
