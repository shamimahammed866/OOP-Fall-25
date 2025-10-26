package com.mycompany.cat;

public class Cat {
    private String name;
    private int age;
    
    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }
    
    public void displayInfo(){
        System.out.println("Cat's Name: " + name);
        System.out.println("Cat's Age: " + age);
    }
  
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.displayInfo();
    }
}