package com.day5.pack;

public class task5 {

    // Method definition
    static int calculate(int input) {

        int value;

        if (input > 0) {
            value = input * 2;
        } else {
            value = 0;
        }

        return value;
    }

    public static void main(String[] args) {
        System.out.println(calculate(-3));
    }
}
