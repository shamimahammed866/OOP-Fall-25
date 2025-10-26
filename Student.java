package com.mycompany.student;

class Student {
    private int studentId;
    private String studentName;
    private char grade;

    public Student() {
        this(0, "Unknown", 'N');    
    }

    public Student(int studentId, String studentName, char grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
        System.out.println("Parameterized Constructor Called:");
    }
    
    public void displayInfo(){
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Grade: " + grade);
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayInfo();
        
        Student s2 = new Student(1196, "Shah Ahammad Ullah Shamim", 'A');
        s2.displayInfo();
    }
}

