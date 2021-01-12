package com.tabachenko.task2;

public class Square extends Figure {
    double side1;

    Square(double A) {
        side1 = A;
    }

    @Override
    public double perimetr() {
        return side1 * 4;
    }

    @Override
    public double area() {
        return side1 * side1;
    }

    public String toString() {
        return "Площа квадрату: " + area() + "; " + " Периметр квадрату: " + perimetr() + "; ";
    }
}
