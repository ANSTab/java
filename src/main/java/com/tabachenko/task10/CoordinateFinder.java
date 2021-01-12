package com.tabachenko.task10;

import java.util.Scanner;

public class CoordinateFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть кординату Х першої точки від 0 до 10: ");
        int x = input.nextInt();

        System.out.println("Введіть кординату У першої точки від 0 до 10:  ");
        int y = input.nextInt();

        System.out.println("Введіть кординату X другої точки від 0 до 10:  ");
        int a = input.nextInt();

        System.out.println("Введіть кординату У другої точки від 0 до 10:  ");
        int b = input.nextInt();

        System.out.println("");

        for (int i = 10; i >= 1; i--) {
            System.out.print(i);

            for (int j = 1; j <= 10; j++) {
                if (i == x & j == y) {
                    System.out.print(" X");
                }
                if (i == a & j == b) {
                    System.out.print(" A");

                } else {
                    System.out.print(" .");
                }

            }

            System.out.println("\n");
        }

        System.out.print("0 1 2 3 4 5 6 7 8 9 10");
        double d = Math.sqrt((a-x)*(a-x)+(b-y)*(b-y));
        System.out.println("");
        System.out.println("відстань між точками: " + d);
    }

}
