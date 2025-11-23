package com.mycompany.main6;

interface Shape
{
    double getArea(); 
}
class Rectangle implements Shape 
{
    double length, width;

    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public double getArea()
    {
        return length * width;
    }
}
class Circle implements Shape
{
    double radius;

    Circle(double radius) 
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return 3.1416 * radius * radius;
    }
}
class Triangle implements Shape
{
    double base, height;

    Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}
public class Main6
{
    public static void main(String[] args) 
    {
        Shape rectangle = new Rectangle(6, 4);
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(7, 3);

        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}