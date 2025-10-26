package com.mycompany.main8;

class Person 
{
    private String name;
    private int age;
    private String country;

    public void setName(String name) 
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setCountry(String country) 
    {
        this.country = country;
    }
    public String getName()
    {
        return name;
    }
    public int getAge() 
    {
        return age;
    }
    public String getCountry() 
    {
        return country;
    }
}
public class Main8 
{
    public static void main(String[] args)
    {
        Person person = new Person();
        person.setName("Kenan");
        person.setAge(21);
        person.setCountry("Turkiye");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());
    }
}