package com.mycompany.dog;

public class Dog {
  
    private String name;
    private String color;
    
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    public void displayInfo(){
        System.out.println("Dog's Name: " + name);
        System.out.println("Dog's Color: " + color);
    }

    public static void main(String[] args) {
        Dog Dog1 = new Dog("Borra", "Ash");
        Dog1.displayInfo();
    }
}