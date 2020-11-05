package com.tabachenko.task2;

public class Triangle extends Figure{
    double side1;
    double side2;
    double side3;
    Triangle(double a,double b,double c){
        side1 = a;
        side2 = b;
        side3 = c;
            }
            @Override
    public double perimetr(){
        return side1 + side2+side3;
    }
    @Override
    public double area (){
        return Math.sqrt(perimetr()/2*(perimetr()/2- side1)*(perimetr()/2 - side2)*(perimetr()/2-side3));
    }
    public String toString(){
        return "Площа трикутника: " + area() + "; "+" Периметр трикутника: " + perimetr()+"; ";
    }
}
