package com.mycompany.main4;

    class House {
    private String address;
    private int numberOfRooms;
    private double area;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calculatePrice(double pricePerSquareMeter) {
        return this.area * pricePerSquareMeter;
    }
}

public class Main4{
     public static void main(String[] args) {
        // Create a new House object
        House house = new House();

        // Set the address, number of rooms, and area of the house
        house.setAddress("23rd Yesil Street");
        house.setNumberOfRooms(4);
        house.setArea(151);

        // Calculate the price of the house with a given price per square meter
        double price = house.calculatePrice(2000);

        // Print the details of the house and its calculated price
        System.out.println("Address: " + house.getAddress());
        System.out.println("Number of Rooms: " + house.getNumberOfRooms());
        System.out.println("Area: " + house.getArea() + " sq meters");
        System.out.println("Price: $" + price);
    }
}