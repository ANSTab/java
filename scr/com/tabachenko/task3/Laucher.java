package com.tabachenko.task3;

public  class Laucher {
    public static void main(String[] args) {
        int[] mass1 = {5, 8, 7};
        int[] mass2 = {7, 5, 8};

        int[] mass3 = {5, 8, 7};
        int[] mass4 = {5, 4, 6};

        int[] mass5 = {5, 8, 7};
        int[] mass6 = {5, 4, 6};

        int[] mass7 = {1, 2, 3, 4};
        int[] mass8 = {3, 4, 5, 6};

        ArrayOperationImpl arrayOperation = new ArrayOperationImpl();

        arrayOperation.printArraysequals(mass3,mass4);
        arrayOperation.printArraysUnion(mass1,mass2);
        arrayOperation.printArraysSubtract(mass3,mass4);
        arrayOperation.printdeleteNull(mass5,mass6);
        arrayOperation.printSymmetricSubtract(mass7,mass8);

    }
}
