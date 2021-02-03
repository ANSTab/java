package com.tabachenko.task12Stream;

import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperetionStreamImpl implements OperetionStream {
    @Override
    public int test(int a, int b) {
        return 0;
    }

    @Override
    public int[] union(int[] a, int[] b) {
               return Ints.concat(a, b);
    }

    @Override
    public int[] subtract(int[] a, int[] b) {
            return Arrays.stream(a).filter(s1 -> Arrays.stream(b).anyMatch(s2 -> s1 == s2)).toArray();
    }

    @Override
    public int[] intersect(int[] a, int[] b) {

        return   Stream.of(a,b).flatMapToInt(Arrays::stream).
                filter(x-> Arrays.stream(a).noneMatch(s->x==s) || Arrays.stream(b).noneMatch(s->x==s)).toArray();

      /*  return Ints.concat(Arrays.stream(a).filter(s1 -> Arrays.stream(b).noneMatch(s2 -> s1 == s2)).toArray(),
                Arrays.stream(b).filter(s1 -> Arrays.stream(a).noneMatch(s2 -> s1 == s2)).toArray());*/

    }

    @Override
    public int[] symmetricSubtract(int[] a, int[] b) {
        //return Arrays.stream(Ints.concat(a, b)).distinct().toArray();
        return Stream.of(a,b).flatMapToInt(i->IntStream.of(i)).distinct().toArray();
    }

}
