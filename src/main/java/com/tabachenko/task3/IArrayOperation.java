package com.tabachenko.task3;

public interface IArrayOperation {

    public int test(int a, int b);

    //Два множества А и В равны (А=В), если они состоят из одних и тех же элементов
    public boolean equals(int[] a, int[] b);

    public void printArraysequals(int[] m, int[] p);

    //Объединением (суммой) множеств А и В называется множество А∪В,
    //элементы которого принадлежат хотя бы одному из этих множеств
    public int[] union(int[] a, int[] b);

    public void printArraysUnion(int[] m, int[] p);

    //Разностью множеств А и В называется множество АВ, элементы которого
    //принадлежат множеству А, но не принадлежат множеству В
    public int[] subtract(int[] a, int[] b);

    public void printArraysSubtract(int[] m, int[] p);

    //Пересечением (произведением) множеств А и В называется множество А ∩ В,
    //элементы которого принадлежат как множеству А, так и множеству В
    public int[] intersect(int[] a, int[] b);

    public void printArraysIntersect(int[] m, int[] p);

    //Симметричной разностью множеств А и В называется множество А Δ В,
    //являющееся объединением разностей множеств АВ и ВА, то есть А Δ В = (АВ) ∪(ВА)
    public int[] symmetricSubtract(int[] a, int[] b);

    public void printSymmetricSubtract(int[] m, int[] p);

    public int[] deleteNull (int [] m, int [] p);

    public void printdeleteNull(int[] m,int[] p);
}



