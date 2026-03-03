package com.day7.pack;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count;

        // Handle negative numbers
        if (number < 0) {
            number = -number;
        }

        if (number >= 10000) {
            count = 5;
        } 
        else if (number >= 1000) {
            count = 4;
        } 
        else if (number >= 100) {
            count = 3;
        } 
        else if (number >= 10) {
            count = 2;
        } 
        else {
            count = 1;
        }

        System.out.println("Number of digits: " + count);

        sc.close();
    }
}