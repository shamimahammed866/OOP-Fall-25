package com.mycompany.book;

public class Book 
{
    private String title;
    private String author;
    private double price;

    public Book() 
    {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    public Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
        this.price = 0.0; 
    }
    public Book(String title, String author, double price) 
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayInfo() 
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Book book1 = new Book();
        System.out.println("Using Default Constructor:");
        book1.displayInfo();

        Book book2 = new Book("Mehmed the Conqueror and His Time", "Franz Babinger");
        System.out.println("Using Constructor with Title and Author:");
        book2.displayInfo();

        Book book3 = new Book("Osman's Dream: The History of the Ottoman Empire", "Caroline Finkel", 29.99);
        System.out.println("Using Constructor with Title, Author, and Price:");
        book3.displayInfo();
    }
}