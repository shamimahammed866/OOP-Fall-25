package com.mycompany.main;

abstract class Animal 
{
    abstract void sound();
}
class Lion extends Animal 
{
    @Override
    void sound() 
    {
        System.out.println("Lion Roars!");
    }
}
class Tiger extends Animal 
{
    @Override
    void sound()
    {
        System.out.println("Tiger Growls!");
    }
}
public class Main
{
    public static void main(String[] args) 
    {
        Animal lion = new Lion();
        Animal tiger = new Tiger();

        lion.sound();   
        tiger.sound();  
    }
}