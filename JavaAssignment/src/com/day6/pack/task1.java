package com.day6.pack;

class Student {

    String name;
    int rollNo;

    void calculateTotal(int m1, int m2, int m3, int m4, int m5) {

        int total = m1 + m2 + m3 + m4 + m5;

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + total);
    }
}

public class task1 {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Vignesh";
        s1.rollNo = 69;

        s1.calculateTotal(85, 90, 88, 89, 79);
    }
}