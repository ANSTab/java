package com.tabachenko.task2;

public  class Rectangle extends Figure{
    double side1;
    double side2;
    Rectangle(double a,double b){
    side1=a;
    side2 = b;
    }
    @Override
    public double perimetr(){
        return (side1 + side2)*2;
    }
    @Override
    public double area (){
        return side1*side2;
    }
    public String toString(){
        return "Площа паралелограму: " + area() + "; "+" Периметр паралелограму: " + perimetr()+"; ";
    }
}
