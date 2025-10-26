package com.mycompany.main2;

class Shape 
{
    double getArea() 
    {
        System.out.println("Calculating area of a generic shape:");
        return 0.0;
    }
}
class Rectangle extends Shape 
{
    double length;
    double width;

    Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }
    @Override
    double getArea()
    {
        super.getArea();
        return length * width;
    }
}
public class Main2 
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle(20, 10);
        
        System.out.println("Area of Rectangle: " + rect.getArea());
    }
}