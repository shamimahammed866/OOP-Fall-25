package com.mycompany.main2;

class Book 
{
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) 
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle() 
    { 
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getAuthor() 
    { 
        return author;
    }
    public void setAuthor(String author)
    { 
        this.author = author;
    }
    public double getPrice() 
    { 
        return price;
    }
    public void setPrice(double price) 
    { 
        this.price = price; 
    }
    public void applyDiscount(double percentage)
    {
        price = price - (price * (percentage / 100));
        System.out.println("Discount applied: " + percentage + "%");
        System.out.println("New Price: " + price);
    }
}
public class Main2 
{
    public static void main(String[] args)
    {
        Book book = new Book("My Name is Red", "Orhan Pamuk", 1500);

        System.out.println
        (
            "Title: " + book.getTitle() +
            "\nAuthor: " + book.getAuthor() +
            "\nPrice: " + book.getPrice()
        );

        book.applyDiscount(10); 
    }
}