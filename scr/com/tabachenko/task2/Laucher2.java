package com.tabachenko.task2;

public class Laucher2 {
    public static void main(String[] args) {

        Figure [] figure = new Figure[4];
        figure [0] = new Rectangle(5,7);
        figure [1] = new Triangle(4,6,3);
        figure[2] = new Square(6);
        figure[3] = new Circle(5);

        for (int i= 0;i<=figure.length-1; i ++){
            String s =  figure[i].toString();
               System.out.println(s);
        }
    }
}
