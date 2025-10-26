package com.mycompany.main5;

class Person 
{
    String firstName;
    String lastName;
//Inheritance and Method Overriding: Person–Employee Example
    Person(String firstName, String lastName) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    void getFirstName() 
    {
        System.out.println("First Name: " + firstName);
    }
    void getLastName()
    {
        System.out.println("Last Name: " + lastName);
    }
}
class Employee extends Person 
{
    String employeeId;
    String jobTitle;

    Employee(String firstName, String lastName, String employeeId, String jobTitle) 
    {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }
    void getEmployeeId() 
    {
        System.out.println("Employee ID: " + employeeId);
    }
    @Override
    void getLastName()
    {
        System.out.println("Last Name: " + lastName + " (" + jobTitle + ")");
    }
}
public class Main5
{
    public static void main(String[] args) 
    {
        Person person = new Person("Kenan", "Yildiz");
        person.getFirstName();
        person.getLastName();
        System.out.println();

        Employee employee = new Employee("Akgun", "Karadeniz", "F196", "Software Engineer");
        employee.getFirstName();
        employee.getLastName();
        employee.getEmployeeId();
    }
}